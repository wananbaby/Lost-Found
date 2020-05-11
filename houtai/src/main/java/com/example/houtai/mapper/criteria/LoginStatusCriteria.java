package com.example.houtai.mapper.criteria;

import lombok.Data;

@Data
public class LoginStatusCriteria {

    private String UserName;

    private String UserPassword;

    private Integer type;
}
