package com.example.houtai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.houtai.domain.*;
import org.springframework.stereotype.Component;

/**
 * (Renling)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 19:12:29
 */
@Mapper
@Component(value = "renlingMapper")
public interface RenlingMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Renling queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Renling> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param renling 实例对象
     * @return 对象列表
     */
    List<Renling> queryAll(Renling renling);

    /**
     * 新增数据
     *
     * @param renling 实例对象
     * @return 影响行数
     */
    int insert(Renling renling);

    /**
     * 修改数据
     *
     * @param renling 实例对象
     * @return 影响行数
     */
    int update(Renling renling);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}