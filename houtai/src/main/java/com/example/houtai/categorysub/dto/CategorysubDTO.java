package com.example.houtai.categorysub.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 021411
 */
@Data
@ApiModel
public class CategorysubDTO implements Serializable {


    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键id自增", dataType = "Long")
    private Long id;
    @ApiModelProperty(value = "排序", dataType = "Integer")
    private Integer parentid;
    @ApiModelProperty(value = "排序", dataType = "Integer")
    private Integer sort;
    @ApiModelProperty(value = "name", dataType = "String")
    private String name;
    @ApiModelProperty(value = "备注", dataType = "String")
    private String remark;

    private List<CategorysubDTO> childrenDTOs;

}
