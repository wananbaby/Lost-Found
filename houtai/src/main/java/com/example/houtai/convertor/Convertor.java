package com.example.houtai.convertor;


import com.example.houtai.categorysub.dto.CategorysubDTO;
import com.example.houtai.domain.Categorysub;

import java.util.ArrayList;
import java.util.List;

public class Convertor {
    /**
     dto.setId(DTO.getId());
     dto.setCategory(DTO.getCategory());
     dto.setSort(DTO.getSort());
     dto.setName(DTO.getName());
     dto.setCode(DTO.getCode());
     dto.setRemark(DTO.getRemark());
     dto.setStatus(DTO.getStatus());
     dto.setValid(DTO.getValid());
     dto.setFkUserCreate(DTO.getFkUserCreate());
     dto.setCreatetime(DTO.getCreatetime());
     dto.setFkUserModify(DTO.getFkUserModify());
     dto.setModifytime(DTO.getModifytime());
     */
    public static List<CategorysubDTO> toDTOS(List<CategorysubDTO> categorysubDTOS){
        List<CategorysubDTO> rootList = new ArrayList<CategorysubDTO>();
        for (int i=0;i<rootList.size();i++){
            CategorysubDTO categorysubDTO = categorysubDTOS.get(i);
            if (categorysubDTO.getParentid()==0){
                rootList.add(categorysubDTO);
            }
        }
        for (CategorysubDTO categorysubDTO : categorysubDTOS){
            categorysubDTO.setChildrenDTOs(getChild(categorysubDTO.getId(),categorysubDTOS));
        }
        return rootList;
    }
    public static List<CategorysubDTO> getChild(Long id,List<CategorysubDTO> list){
        List<CategorysubDTO> childList = new ArrayList<CategorysubDTO>();
        for (CategorysubDTO m : list){
            if (m.getParentid().intValue() == id.longValue()){
                childList.add(m);
            }
        }
        for (CategorysubDTO ca : childList){
            ca.setChildrenDTOs(getChild(ca.getId(),list));
        }
        if (childList.size() == 0){
            return null;
        }
        return childList;
    }
    public static List<CategorysubDTO> Categorysub2DTO(List<Categorysub> categorysubs){
        if (categorysubs == null){
            return null;
        }
        List<CategorysubDTO> categorysubDTOList = new ArrayList<CategorysubDTO>();
        for (Categorysub categorysub : categorysubs){
            CategorysubDTO categorysubDTO = toCategorysubDTO(categorysub);
            categorysubDTOList.add(categorysubDTO);
        }
        return categorysubDTOList;

    }
    public static CategorysubDTO toCategorysubDTO(Categorysub DTO){
        if (DTO == null){
            return null;
        }
        CategorysubDTO dto = new CategorysubDTO();
        dto.setId(DTO.getId());
        dto.setParentid(DTO.getParentid());
        dto.setSort(DTO.getSort());
        dto.setName(DTO.getName());
        dto.setRemark(DTO.getRemark());
        return dto;
    }
}
