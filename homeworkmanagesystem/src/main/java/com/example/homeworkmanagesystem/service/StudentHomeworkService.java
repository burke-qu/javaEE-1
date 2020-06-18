package com.example.homeworkmanagesystem.service;

import com.example.homeworkmanagesystem.entity.StudentHomework;
import java.util.List;

/**
 * (StudentHomework)表服务接口
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
public interface StudentHomeworkService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    StudentHomework queryById(Long id);

    /**
     * 查询所有数据
     * @return 对象列表
     */
    List<StudentHomework> queryAll();

    /**
     * 新增数据
     *
     * @param studentHomework 实例对象
     * @return int
     */
    int insert(StudentHomework studentHomework);

    /**
     * 修改数据
     *
     * @param studentHomework 实例对象
     * @return int
     */
    int update(StudentHomework studentHomework);



}