package com.example.houtai.boot;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseDTO implements Serializable {
    private static final long serialVersionUID = 6326582034417234241L;

    @ApiModelProperty(value="响应消息",dataType="String",required=true,example="操作成功")
    private String message;

    @ApiModelProperty(value="错误消息",dataType="String", example="错误提示信息(可选)")
    private String errorMessage;

    @ApiModelProperty(value="状态码",dataType="Integer",required=true,example="100")
    private String responseCode;

    @ApiModelProperty(value="是否包含错误",dataType="Boolean",required=true,example="false")
    private boolean hasError;

    public ResponseDTO() {
        this.message = "操作成功";
        this.responseCode = "200";
        this.hasError = false;
        this.errorMessage = "";
    }
}
