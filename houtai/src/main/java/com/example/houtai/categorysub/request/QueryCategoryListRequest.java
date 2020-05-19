package com.example.houtai.categorysub.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class QueryCategoryListRequest{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "主键id自增", dataType = "Long")
    private Long id;
}
