package com.example.houtai.boot;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class CommandDTO implements Serializable {

    private static final long serialVersionUID = -5677531034960914850L;

    @ApiModelProperty(value = "用户ID", dataType = "Integer", example = "10000", required = true)
    private Integer user;

    @ApiModelProperty(value = "用户名", dataType = "String", example = "admin", required = true)
    private String userName;

//    @ApiModelProperty(value = "用户真实姓名", dataType = "String", example = "黄奕铭", required = true)
//    private String userTrueName;
//
//    @ApiModelProperty(value = "公司ID", dataType = "Integer", example = "66", required = true)
//    private Integer companyId;
//
//    @ApiModelProperty(value = "公司名称",dataType = "String", example = "旅行社", required = true)
//    private String companyName;
//
//    @ApiModelProperty(value = "部门ID", dataType = "Integer", example = "1366", required = true)
//    private Integer departmentId;
//
//    @ApiModelProperty(value = "部门名称", dataType = "Integer", example = "销售部", required = true)
//    private String departmentName;
}
