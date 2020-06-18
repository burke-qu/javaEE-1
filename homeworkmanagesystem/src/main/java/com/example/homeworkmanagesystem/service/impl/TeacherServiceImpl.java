package com.example.homeworkmanagesystem.service.impl;

import com.example.homeworkmanagesystem.entity.Teacher;
import com.example.homeworkmanagesystem.dao.TeacherDao;
import com.example.homeworkmanagesystem.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param name 姓名
     * @param password 密码
     * @return 实例对象
     */
    @Override
    public Teacher query(String name, String password) {
        return this.teacherDao.query(name, password);
    }

    /**
     * 通过name查询单条数据
     *
     * @param name 姓名
     * @return 实例对象
     */
    @Override
    public Teacher queryByName(String name) {
        return this.teacherDao.queryByName(name);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Teacher teacher) {

        return this.teacherDao.insert(teacher);
    }

}