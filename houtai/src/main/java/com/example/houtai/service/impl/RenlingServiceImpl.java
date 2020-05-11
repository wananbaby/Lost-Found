package com.example.houtai.service.impl;

import com.example.houtai.domain.Renling;
import com.example.houtai.mapper.RenlingMapper;
import com.example.houtai.service.RenlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Renling)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 19:12:29
 */
@Service
public class RenlingServiceImpl implements RenlingService {

    @Autowired
    private RenlingMapper renlingMapper;

    public RenlingServiceImpl(RenlingMapper renlingMapper){
        this.renlingMapper = renlingMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Renling queryById(Integer id) {
        return this.renlingMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Renling> queryAllByLimit(int offset, int limit) {
        return this.renlingMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param renling 实例对象
     * @return 实例对象
     */
    @Override
    public Renling insert(Renling renling) {
        this.renlingMapper.insert(renling);
        return renling;
    }

    /**
     * 修改数据
     *
     * @param renling 实例对象
     * @return 实例对象
     */
    @Override
    public Renling update(Renling renling) {
        this.renlingMapper.update(renling);
        return this.queryById(renling.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.renlingMapper.deleteById(id) > 0;
    }
}