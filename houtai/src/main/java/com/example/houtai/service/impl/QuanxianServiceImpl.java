package com.example.houtai.service.impl;


import com.example.houtai.domain.Quanxian;
import com.example.houtai.mapper.QuanxianMapper;
import com.example.houtai.service.QuanxianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Quanxian)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 19:12:15
 */
@Service
public class QuanxianServiceImpl implements QuanxianService {

    @Autowired
    private QuanxianMapper quanxianDao;

    /**
     * 通过ID查询单条数据
     *
     * @param username 主键
     * @return 实例对象
     */
    @Override
    public Quanxian queryById(String username) {
        return this.quanxianDao.queryById(username);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Quanxian> queryAllByLimit(int offset, int limit) {
        return this.quanxianDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param quanxian 实例对象
     * @return 实例对象
     */
    @Override
    public Quanxian insert(Quanxian quanxian) {
        this.quanxianDao.insert(quanxian);
        return quanxian;
    }

    /**
     * 修改数据
     *
     * @param quanxian 实例对象
     * @return 实例对象
     */
    @Override
    public Quanxian update(Quanxian quanxian) {
        this.quanxianDao.update(quanxian);
        return this.queryById(quanxian.getUsername());
    }

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String username) {
        return this.quanxianDao.deleteById(username) > 0;
    }
}