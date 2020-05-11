package com.example.houtai.domain;

import java.io.Serializable;

/**
 * (Wupin)实体类
 *
 * @author makejava
 * @since 2020-05-05 19:12:41
 */
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Wupin implements Serializable {
    private static final long serialVersionUID = -47130106621049901L;
    
    private Integer id;
    
    private String name;
    /**
    * 0:丢失1:捡到
    */
    private Integer type;
    
    private String zhonglei;
    
    private String openid;
    
    private String photolink;
    /**
    * 是否物归原主
    */
    private Integer valid;
    /**
    * 备注
    */
    private String remark;
    
    private Integer createuser;
    
    private Object createtime;
    
    private Integer modifyuser;
    
    private Object modifytime;


}