package com.example.houtai.houtai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("UserName")
    private String UserName;
    @JsonProperty("UserPassword")
    private String UserPassword;
    @JsonProperty("type")
    private Integer type;
}
