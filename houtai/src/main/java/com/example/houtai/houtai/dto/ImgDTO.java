package com.example.houtai.houtai.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImgDTO implements Serializable {
    public static final long serialVersionUID = 1L;

    @JsonProperty("id")
    @ApiModelProperty(value = "id",dataType = "Long",example = "1")
    private Long id;
    @ApiModelProperty(value = "描述",dataType = "String",example = "w")
    @JsonProperty("miaoshu")
    private String miaoshu;
    @ApiModelProperty(value = "src",dataType = "String",example = "w")
    @JsonProperty("src")
    private String src;
    @ApiModelProperty(value = "备注",dataType = "String",example = "w")
    @JsonProperty("remark")
    private String remark;
    @ApiModelProperty(value = "用户id",dataType = "Integer",example = "1")
    @JsonProperty("UserId")
    private Integer UserId;
}
