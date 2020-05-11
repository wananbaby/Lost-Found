package com.example.houtai.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.example.houtai.domain.Quanxian;
import org.springframework.stereotype.Component;

/**
 * (Quanxian)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-05 19:12:15
 */
@Mapper
@Component(value = "quanxianMapper")
public interface QuanxianMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param username 主键
     * @return 实例对象
     */
    Quanxian queryById(String username);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Quanxian> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param quanxian 实例对象
     * @return 对象列表
     */
    List<Quanxian> queryAll(Quanxian quanxian);

    /**
     * 新增数据
     *
     * @param quanxian 实例对象
     * @return 影响行数
     */
    int insert(Quanxian quanxian);

    /**
     * 修改数据
     *
     * @param quanxian 实例对象
     * @return 影响行数
     */
    int update(Quanxian quanxian);

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 影响行数
     */
    int deleteById(String username);

}