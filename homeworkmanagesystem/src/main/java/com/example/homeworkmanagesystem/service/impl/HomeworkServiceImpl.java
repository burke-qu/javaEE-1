package com.example.homeworkmanagesystem.service.impl;

import com.example.homeworkmanagesystem.entity.Homework;
import com.example.homeworkmanagesystem.dao.HomeworkDao;
import com.example.homeworkmanagesystem.service.HomeworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Homework)表服务实现类
 *
 * @author makejava
 * @since 2020-06-18 14:50:38
 */
@Service("homeworkService")
public class HomeworkServiceImpl implements HomeworkService {
    @Resource
    private HomeworkDao homeworkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Homework queryById(Long id) {
        return this.homeworkDao.queryById(id);
    }

    /**
     * 查询所有数据
     * @return 对象列表
     */
    @Override
    public List<Homework> queryAll() {
        return this.homeworkDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param homework 实例对象
     * @return int
     */
    @Override
    public int insert(Homework homework) {

        return this.homeworkDao.insert(homework);
    }


}