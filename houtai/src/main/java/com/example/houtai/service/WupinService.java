package com.example.houtai.service;

import com.example.houtai.domain.Wupin;

import java.util.List;

/**
 * (Wupin)表服务接口
 *
 * @author makejava
 * @since 2020-05-05 19:12:41
 */
public interface WupinService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Wupin queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Wupin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wupin 实例对象
     * @return 实例对象
     */
    Wupin insert(Wupin wupin);

    /**
     * 修改数据
     *
     * @param wupin 实例对象
     * @return 实例对象
     */
    Wupin update(Wupin wupin);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}