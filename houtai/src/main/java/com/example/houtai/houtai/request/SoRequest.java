package com.example.houtai.houtai.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SoRequest {
    @JsonProperty(value = "text")
    private String text;
}
