package com.example.houtai.houtai.response;

import com.example.houtai.boot.ResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterResponse extends ResponseDTO {

    @NotNull
    private String registerStatus;
    @NotNull
    private String UserName;

}
