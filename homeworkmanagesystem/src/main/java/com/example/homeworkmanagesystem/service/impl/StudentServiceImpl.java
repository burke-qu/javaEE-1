package com.example.homeworkmanagesystem.service.impl;

import com.example.homeworkmanagesystem.dao.StudentDao;
import com.example.homeworkmanagesystem.entity.Student;
import com.example.homeworkmanagesystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Student)表服务实现类
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param name 姓名
     * @param password 密码
     * @return 实例对象
     */
    @Override
    public Student query(String name, String password) {
        return this.studentDao.query(name, password);
    }
    /**
     * 通过name查询单条数据
     *
     * @param name 姓名
     * @return 实例对象
     */
    @Override
    public Student queryByName(String name) {
        return this.studentDao.queryByName(name);
    }

    /**
     * 新增数据
     *
     * @param student 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Student student) {

        return this.studentDao.insert(student);
    }

}