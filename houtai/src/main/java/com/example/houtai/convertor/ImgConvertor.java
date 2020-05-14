package com.example.houtai.convertor;

import com.example.houtai.houtai.dto.ImgReadDTO;
import com.example.houtai.domain.Img;

public class ImgConvertor {

    public static ImgReadDTO convert2ImgReadDTO(Img img){

        ImgReadDTO imgReadDTO = new ImgReadDTO();

        imgReadDTO.setMiaoshu(img.getMiaoshu());
        String s = img.getSrc().substring(0,1);
        if (s.equals("h")){
            imgReadDTO.setSrc(img.getSrc());
        }else {
            imgReadDTO.setSrc("http://sczlzys.cn:"+img.getSrc());
        }
        imgReadDTO.setRemark(img.getRemark());
        imgReadDTO.setUserId(img.getUserid().intValue());

        return imgReadDTO;
    }
}
