package com.example.houtai.houtai.request;

import com.example.houtai.houtai.dto.UserDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class RegisterRequest {
    private static final long serialVersionUID = 1L;

    @NotNull
    @JsonProperty("UserDTO")
    private UserDTO userDTO;
}
