package com.example.houtai.houtai.request;

import com.example.houtai.houtai.dto.LoginDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;

@Data
public class LoginRequest {

    private static final long serialVersionUID = 1L;

    @NotNull
    @JsonProperty("loginDTO")
    private LoginDTO loginDTO;

//    @NotNull
//    @JsonProperty(value = "session")
//    private HttpSession session;
}
