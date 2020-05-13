package com.example.houtai.houtai.request;

import com.example.houtai.boot.RequestDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class OkRequest{

    @JsonProperty("id")
    private String name;
    @JsonProperty("userId")
    private Long userId;

}
