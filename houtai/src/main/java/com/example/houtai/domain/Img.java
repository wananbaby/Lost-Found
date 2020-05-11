package com.example.houtai.domain;

import java.io.Serializable;

/**
 * (Img)实体类
 *
 * @author makejava
 * @since 2020-05-05 19:01:10
 */
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Img implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private String miaoshu;
    
    private String src;
    
    private String remark;
    
    private Long userid;


}