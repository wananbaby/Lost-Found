package com.example.houtai.houtai.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImgReadDTO implements Serializable {

    /**
     * miaoshu: null,
     *             src: null,
     *             remark: null,
     *             UserId:null
     */
    private static final long serialVersionUID = 1L;
    @JsonProperty("miaoshu")
    private String miaoshu;
    @JsonProperty("src")
    private String src;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("UserId")
    private Integer UserId;
}
