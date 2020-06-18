package com.example.homeworkmanagesystem.dao;

import com.example.homeworkmanagesystem.entity.StudentHomework;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (StudentHomework)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
public interface StudentHomeworkDao {

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
     * @return 影响行数
     */
    int insert(StudentHomework studentHomework);

    /**
     * 修改数据
     *
     * @param studentHomework 实例对象
     * @return 影响行数
     */
    int update(StudentHomework studentHomework);

}