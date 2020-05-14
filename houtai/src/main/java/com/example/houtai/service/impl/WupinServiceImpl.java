package com.example.houtai.service.impl;

import com.example.houtai.domain.Wupin;
import com.example.houtai.mapper.WupinMapper;
import com.example.houtai.service.WupinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (Wupin)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 19:12:41
 */
@Service
public class WupinServiceImpl implements WupinService {

    @Autowired
    private WupinMapper wupinMapper;

    public WupinServiceImpl(WupinMapper wupinMapper){
        this.wupinMapper = wupinMapper;
    }


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Wupin queryById(Integer id) {
        return this.wupinMapper.queryById(id);
    }

    @Override
    public List<Wupin> queryByAll(Wupin wupin) {
        return this.wupinMapper.queryAll(wupin);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Wupin> queryAllByLimit(int offset, int limit) {
        return this.wupinMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wupin 实例对象
     * @return 实例对象
     */
    @Override
    public Wupin insert(Wupin wupin) {
        this.wupinMapper.insert(wupin);
        return wupin;
    }

    /**
     * 修改数据
     *
     * @param wupin 实例对象
     * @return 实例对象
     */
    @Override
    public Wupin update(Wupin wupin) {
        this.wupinMapper.update(wupin);
        return this.queryById(wupin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wupinMapper.deleteById(id) > 0;
    }
}