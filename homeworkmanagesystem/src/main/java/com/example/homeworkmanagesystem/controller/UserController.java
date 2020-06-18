package com.example.homeworkmanagesystem.controller;

import com.example.homeworkmanagesystem.entity.Student;
import com.example.homeworkmanagesystem.entity.Teacher;
import com.example.homeworkmanagesystem.service.StudentService;
import com.example.homeworkmanagesystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    @Autowired
    private Student student;

    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    @Autowired
    private Teacher teacher;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public void userLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String type = req.getParameter("user");
        if (type.equals("学生")) {
            student = this.studentService.query(name, password);
            if (student == null) {
                resp.getWriter().println("登陆失败");
                //设置3秒钟跳转
                resp.setHeader("refresh", "2;url=/lgjsp");
            } else {
                resp.getWriter().println("登陆成功");
                //设置3秒钟跳转
                resp.setHeader("refresh", "2;url=/student");
            }
        } else {
            teacher = this.teacherService.query(name, password);
            if (teacher == null) {
                resp.getWriter().println("登陆失败");
                //设置3秒钟跳转
                resp.setHeader("refresh", "2;url=/lgjsp");
            } else {
                resp.getWriter().println("登陆成功");
                //设置3秒钟跳转
                resp.setHeader("refresh", "2;url=/teacher");
            }
        }
    }

    /**
     * 用户注册
     */
    @PostMapping(value = "/register")
    public void userRegister(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        String type = req.getParameter("user");
        String name = req.getParameter("name");
        if (type.equals("学生")) {

            Student student1 = studentService.queryByName(name);
            if(student1 != null){
                resp.getWriter().println("注册失败.用户名重复");
                resp.setHeader("refresh", "2;url=/rgjsp");
            }else{
            /**
             * 赋值
             */

            student.setName(name);
            student.setPassword(req.getParameter("password"));
            student.setCreateTime(new Date());
            int result = studentService.insert(student);
            if (result != 0) {
                resp.getWriter().println("注册成功");
                //设置3秒钟跳转
                resp.setHeader("refresh", "2;url=/student");
            } else {
                resp.getWriter().println("注册失败");
                resp.setHeader("refresh", "2;url=/rgjsp");
            }
            }
        } else {

            Teacher teacher1 = teacherService.queryByName(name);
            if(teacher1 != null){
                resp.getWriter().println("注册失败.用户名重复");
                resp.setHeader("refresh", "2;url=/rgjsp");
            }else {
                /**
                 * 赋值
                 */
                teacher.setName(name);
                teacher.setPassword(req.getParameter("password"));
                teacher.setCreateTime(new Date());
                int result = this.teacherService.insert(teacher);
                if (result != 0) {
                    resp.getWriter().println("注册成功");
                    //设置3秒钟跳转
                    resp.setHeader("refresh", "2;url=/teacher");
                } else {
                    resp.getWriter().println("注册失败");
                    resp.setHeader("refresh", "2;url=/rgjsp");
                }
            }
        }
    }
}
