package com.example.homeworkmanagesystem.service.impl;

import com.example.homeworkmanagesystem.entity.StudentHomework;
import com.example.homeworkmanagesystem.dao.StudentHomeworkDao;
import com.example.homeworkmanagesystem.service.StudentHomeworkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentHomework)表服务实现类
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Service("studentHomeworkService")
public class StudentHomeworkServiceImpl implements StudentHomeworkService {
    @Resource
    private StudentHomeworkDao studentHomeworkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public StudentHomework queryById(Long id) {
        return this.studentHomeworkDao.queryById(id);
    }

    /**
     * 查询所有数据
     * @return 对象列表
     */
    @Override
    public List<StudentHomework> queryAll() {
        return this.studentHomeworkDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param studentHomework 实例对象
     * @return int
     */
    @Override
    public int insert(StudentHomework studentHomework) {

        return this.studentHomeworkDao.insert(studentHomework);
    }

    /**
     * 修改数据
     *
     * @param studentHomework 实例对象
     * @return int
     */
    @Override
    public int update(StudentHomework studentHomework) {

        return this.studentHomeworkDao.update(studentHomework);
    }
}