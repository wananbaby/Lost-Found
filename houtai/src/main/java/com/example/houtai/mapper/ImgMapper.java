package com.example.houtai.mapper;

import com.example.houtai.domain.Img;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Img)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 19:03:57
 */
@Mapper
@Component(value = "ImgMapper")
public interface ImgMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Img queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Img> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param img 实例对象
     * @return 对象列表
     */
    List<Img> queryAll(Img img);

    /**
     * 新增数据
     *
     * @param img 实例对象
     * @return 影响行数
     */
    int insert(Img img);

    /**
     * 修改数据
     *
     * @param img 实例对象
     * @return 影响行数
     */
    int update(Img img);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}