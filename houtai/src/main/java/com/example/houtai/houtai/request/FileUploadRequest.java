package com.example.houtai.houtai.request;


import com.example.houtai.boot.RequestDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = false)
public class FileUploadRequest {


    @JsonProperty("file")
    private MultipartFile file;
    @JsonProperty("name")
    private String name;
    @JsonProperty("h2id")
    private Long h2id;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("beizhu")
    private String beizhu;
}
