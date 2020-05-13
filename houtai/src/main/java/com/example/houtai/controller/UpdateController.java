package com.example.houtai.controller;


import com.example.houtai.boot.ResponseDTO;
import com.example.houtai.domain.Img;
import com.example.houtai.domain.Wupin;
import com.example.houtai.houtai.request.FileUploadRequest;
import com.example.houtai.service.ImgService;
import com.example.houtai.service.SampleService;
import com.example.houtai.service.SmsService;
import com.example.houtai.service.WupinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/Update")
public class UpdateController {


//    @Autowired
//    private SampleService sampleService;
//    public UpdateController(SampleService sampleService){
//        this.sampleService = sampleService;
//    }
    @Autowired
    private ImgService imgService;
    @Autowired
    private SampleService sampleService;
    @Autowired
    private WupinService wupinService;
    public UpdateController(ImgService imgService,SampleService sampleService,WupinService wupinService){
        this.imgService = imgService;
        this.sampleService = sampleService;
        this.wupinService = wupinService;
    }



    @ResponseBody
    @RequestMapping(path = "/fileUpdate",method = RequestMethod.POST ,produces = "application/json;charset=UTF-8")
    @ApiOperation(value = "发布")
    private ResponseDTO fileUpdate(@RequestBody FileUploadRequest request) throws IOException {
        MultipartFile file = request.getFile();
        if (file!=null){
            String filePath = "C://img//";
            String filename = file.getOriginalFilename();
            String path = filePath+filename;
            File file1 = new File(path);
            if (!file1.getParentFile().exists()){
                file1.getParentFile().mkdirs();
            }
            file.transferTo(file1);
            String miaoshu = sampleService.BaiduImg(path);
            if (miaoshu == request.getName()){
            }
            else {
                miaoshu = miaoshu+request.getBeizhu();
            }
//            String miaoshu = request.getName();
            Img img = new Img();
            img.setMiaoshu(miaoshu);
            img.setSrc(path);
            img.setRemark(request.getBeizhu());
            img.setUserid(request.getH2id());
            imgService.insert(img);
            Wupin wupin = new Wupin();
            wupin.setName(miaoshu);
            wupin.setType(request.getType());
            wupin.setPhotolink(path);
            wupin.setValid(0);
            wupin.setRemark(request.getBeizhu());
            wupin.setCreateuser(request.getH2id().intValue());
            wupinService.insert(wupin);
        }
        return  new ResponseDTO();
    }
}
