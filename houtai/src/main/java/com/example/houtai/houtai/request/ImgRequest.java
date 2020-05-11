package com.example.houtai.houtai.request;


import com.example.houtai.houtai.dto.ImgDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ImgRequest {

    @NotNull
    @JsonProperty("UserName")
    private String UserName;

}
