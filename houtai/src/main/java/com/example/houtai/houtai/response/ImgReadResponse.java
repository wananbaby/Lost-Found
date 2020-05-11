package com.example.houtai.houtai.response;


import com.example.houtai.houtai.dto.ImgReadDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = false)
public class ImgReadResponse {

    @NotNull
    @JsonProperty("size")
    private int size;

    @NotNull
    @JsonProperty("imgMap")
    private Map<Integer, ImgReadDTO> imgMap = new HashMap<>();
}
