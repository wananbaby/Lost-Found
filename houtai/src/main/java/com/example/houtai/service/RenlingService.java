package com.example.houtai.service;

import com.example.houtai.domain.Renling;

import java.util.List;

/**
 * (Renling)表服务接口
 *
 * @author makejava
 * @since 2020-05-05 19:12:29
 */
public interface RenlingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Renling queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Renling> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param renling 实例对象
     * @return 实例对象
     */
    Renling insert(Renling renling);

    /**
     * 修改数据
     *
     * @param renling 实例对象
     * @return 实例对象
     */
    Renling update(Renling renling);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}