package com.example.houtai.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Categorysub {

    private Long id;
    private Integer parentid;
    private Integer sort;
    private String name;
    private String remark;

}
