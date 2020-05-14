package com.example.houtai.domain;

import java.io.Serializable;

/**
 * (Renling)实体类
 *
 * @author makejava
 * @since 2020-05-05 19:12:29
 */
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Renling implements Serializable {
    private Integer id;
    
    private Integer wupinid;
    
    private String name;
    /**
    * 认领人
    */
    private Integer claimantid;
    
    private Integer valid;


}