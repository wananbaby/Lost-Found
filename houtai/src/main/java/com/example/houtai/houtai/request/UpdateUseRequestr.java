package com.example.houtai.houtai.request;

import com.example.houtai.boot.RequestDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UpdateUseRequestr extends RequestDTO {
    private static final long serialVersionUID = 1;
    @JsonProperty("nicheng")
    private String nicheng;
}
