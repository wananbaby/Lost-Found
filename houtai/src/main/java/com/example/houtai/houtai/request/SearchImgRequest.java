package com.example.houtai.houtai.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SearchImgRequest {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "String",dataType = "String")
    private String str;
}
