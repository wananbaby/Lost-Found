package com.example.houtai.houtai.request;


import com.example.houtai.boot.RequestCommandDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SmsRequest extends RequestCommandDTO {

    private static final long serialVersionUID = 3623733963971517684L;

    @NotNull
    @JsonProperty("phone")
    private Long phone;
}
