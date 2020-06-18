package com.example.homeworkmanagesystem.service;

import com.example.homeworkmanagesystem.entity.Homework;
import java.util.List;

/**
 * (Homework)表服务接口
 *
 * @author makejava
 * @since 2020-06-18 14:50:37
 */
public interface HomeworkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Homework queryById(Long id);

    /**
     * 查询所有数据
     * @return 对象列表
     */
    List<Homework> queryAll();

    /**
     * 新增数据
     *
     * @param homework 实例对象
     * @return int
     */
    int insert(Homework homework);

}