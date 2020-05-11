package com.example.houtai.houtai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("UserPassword")
    private String UserPassword;

}
