package com.example.houtai.domain;

import java.io.Serializable;

/**
 * (Quanxian)实体类
 *
 * @author makejava
 * @since 2020-05-05 19:12:15
 */
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Quanxian implements Serializable {

    
    private String username;
    
    private String openid;
    
    private Object role;


}