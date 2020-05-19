package com.example.houtai.categorysub.response;

import com.example.houtai.categorysub.dto.CategorysubDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author 021411
 */
@ApiModel
@Data
@EqualsAndHashCode(callSuper = false)
public class QueryCategoryListResponse{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "查询结果列表")
    private List<CategorysubDTO> categorysubDTOList ;


}
