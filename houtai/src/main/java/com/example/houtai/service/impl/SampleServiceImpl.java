package com.example.houtai.service.impl;


import com.baidu.aip.imageclassify.AipImageClassify;
import com.example.houtai.domain.Img;
import com.example.houtai.domain.Sample;
import com.example.houtai.domain.Wupin;
import com.example.houtai.mapper.ImgMapper;
import com.example.houtai.mapper.WupinMapper;
import com.example.houtai.service.SampleService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Service
public class SampleServiceImpl implements SampleService {
//
//    @Autowired
//    private ImgMapper imgMapper;
//
//    @Autowired
//    private WupinMapper wupinMapper;


    @Override
    public String BaiduImg(@NotNull(message = "image 不能为空") String image) {

        Sample sample = new Sample();
        AipImageClassify client = new AipImageClassify(Sample.APP_ID,Sample.API_KEY,Sample.SECRET_KEY);

        HashMap<String, String> options = new HashMap<String, String>();
        options.put("baike_num", "0");
        // 参数为本地路径
        JSONObject res = client.advancedGeneral(image, options);
//        System.out.println(res.toString(2));
        JSONArray jsonArray= res.getJSONArray("result");
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        String s = jsonObject.getString("keyword");
//        System.out.println(s);
        return s;

    }

//    @Override
//    public Wupin insert(Wupin wupin) {
//        wupinMapper.insert(wupin);
//        return wupin;
//    }
//    @Override
//    public Img insert(Img img) {
//        imgMapper.insert(img);
//        return img;
//    }
}
