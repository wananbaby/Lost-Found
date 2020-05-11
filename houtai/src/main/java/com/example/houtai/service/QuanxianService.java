package com.example.houtai.service;

import com.example.houtai.domain.Quanxian;

import java.util.List;

/**
 * (Quanxian)表服务接口
 *
 * @author makejava
 * @since 2020-05-05 19:12:15
 */
public interface QuanxianService {

    /**
     * 通过ID查询单条数据
     *
     * @param username 主键
     * @return 实例对象
     */
    Quanxian queryById(String username);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Quanxian> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param quanxian 实例对象
     * @return 实例对象
     */
    Quanxian insert(Quanxian quanxian);

    /**
     * 修改数据
     *
     * @param quanxian 实例对象
     * @return 实例对象
     */
    Quanxian update(Quanxian quanxian);

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    boolean deleteById(String username);

}