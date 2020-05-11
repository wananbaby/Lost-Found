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
    @JsonProperty("miaoshu")
    private String miaoshu;
    @JsonProperty("src")
    private String src;
    @JsonProperty("remark")
    private String remark;
    @JsonProperty("UserId")
    private Integer UserId;
}
