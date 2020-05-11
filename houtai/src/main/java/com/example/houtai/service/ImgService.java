package com.example.houtai.service;

import java.util.List;
import com.example.houtai.domain.Img;
/**
 * (Img)表服务接口
 *
 * @author makejava
 * @since 2020-05-05 19:01:10
 */
public interface ImgService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Img queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Img> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param img 实例对象
     * @return 实例对象
     */
    Img insert(Img img);

    /**
     * 修改数据
     *
     * @param img 实例对象
     * @return 实例对象
     */
    Img update(Img img);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}