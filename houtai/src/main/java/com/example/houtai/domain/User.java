package com.example.houtai.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class User {

    private Integer id;
    private String UserName;
    private String UserPassword;
    private Integer type;

    private String openid;

    private Long qqhao;

    private Long phone;

    private String beizhu;

}
