package com.example.houtai.service.impl;

import com.example.houtai.domain.Img;
import com.example.houtai.mapper.ImgMapper;
import com.example.houtai.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Img)表服务实现类
 *
 * @author makejava
 * @since 2020-05-05 19:01:10
 */
@Service
public class ImgServiceImpl implements ImgService {

    @Autowired
    private ImgMapper imgDao;
    public ImgServiceImpl(ImgMapper imgMapper){
        this.imgDao = imgMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Img queryById(Long id) {
        return this.imgDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Img> queryAllByLimit(int offset, int limit) {
        return this.imgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param img 实例对象
     * @return 实例对象
     */
    @Override
    public Img insert(Img img) {
        this.imgDao.insert(img);
        return img;
    }

    /**
     * 修改数据
     *
     * @param img 实例对象
     * @return 实例对象
     */
    @Override
    public Img update(Img img) {
        this.imgDao.update(img);
        return this.queryById(img.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.imgDao.deleteById(id) > 0;
    }
}