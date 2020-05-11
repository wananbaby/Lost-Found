package com.example.houtai.houtai.request;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class QueryImgRequest {
    private static final Long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id",dataType = "Long",example = "1")
    private Long id;
    @ApiModelProperty(value = "描述",dataType = "String",example = "女枪")
    private String miaoshu;
    @ApiModelProperty(value = "src",dataType = "String",example = "http://baidu.com")
    private String src;
    @ApiModelProperty(value = "备注",dataType = "String",example = "no")
    private String remark;
    @ApiModelProperty(value = "用户id",dataType = "Long",example = "1")
    private Long UserId;
}
