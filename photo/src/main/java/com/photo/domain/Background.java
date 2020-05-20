package com.photo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;

/**
 * @author 021411
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Background {
    private String api_key;
    private String api_secret;
    private File image_file;
}
