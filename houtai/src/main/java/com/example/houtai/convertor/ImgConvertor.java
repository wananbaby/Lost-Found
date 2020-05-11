package com.example.houtai.convertor;

import com.example.houtai.houtai.dto.ImgReadDTO;
import com.example.houtai.domain.Img;

public class ImgConvertor {

    public static ImgReadDTO convert2ImgReadDTO(Img img){

        ImgReadDTO imgReadDTO = new ImgReadDTO();

        imgReadDTO.setMiaoshu(img.getMiaoshu());
        imgReadDTO.setSrc(img.getSrc());
        imgReadDTO.setRemark(img.getRemark());
        imgReadDTO.setUserId(img.getUserid().intValue());

        return imgReadDTO;
    }
}
