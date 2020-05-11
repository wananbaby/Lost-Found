package com.example.houtai.mapper;

import com.example.houtai.domain.Wupin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (Wupin)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 19:12:41
 */
@Mapper
@Component(value = "wupinMapper")
public interface WupinMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Wupin queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Wupin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wupin 实例对象
     * @return 对象列表
     */
    List<Wupin> queryAll(Wupin wupin);

    /**
     * 新增数据
     *
     * @param wupin 实例对象
     * @return 影响行数
     */
    int insert(Wupin wupin);

    /**
     * 修改数据
     *
     * @param wupin 实例对象
     * @return 影响行数
     */
    int update(Wupin wupin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}