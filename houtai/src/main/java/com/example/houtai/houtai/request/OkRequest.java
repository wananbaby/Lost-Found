package com.example.houtai.houtai.request;

import com.example.houtai.boot.RequestDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel
public class OkRequest extends RequestDTO{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物品名称",dataType = "String")
    @JsonProperty("miaoshu")
    private String name;

    @ApiModelProperty(value = "确认用户id",dataType = "Long")
    @JsonProperty("userId")
    private Long userId;

}
