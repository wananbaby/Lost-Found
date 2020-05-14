package com.example.houtai.houtai.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper =false )
public class UserResponse extends ResponseDTO {

    @NotNull
    private String loginStatus;
    @NotNull
    private String UserName;
    @NotNull
    private Integer type;//0:管理员1:丢失者2:捡到者

}
