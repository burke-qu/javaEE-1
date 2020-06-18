package com.example.homeworkmanagesystem.controller;

import com.example.homeworkmanagesystem.entity.StudentHomework;
import com.example.homeworkmanagesystem.service.StudentHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * (StudentHomework)表控制层
 *
 * @author makejava
 * @since 2020-06-18 14:50:39
 */
@Controller
@RequestMapping("studentHomework")
public class StudentHomeworkController {
    /**
     * 服务对象
     */
    @Resource
    private StudentHomeworkService studentHomeworkService;

    @Autowired
    private StudentHomework sh;
    /**
     * 提交作业
     * @return
     */

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public void submitHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        sh.setStudentId(Long.parseLong(req.getParameter("student_id")));
        sh.setHomeworkId(Long.parseLong(req.getParameter("homework_id")));
        sh.setHomeworkTitle(req.getParameter("homework_title"));
        sh.setHomeworkContent(req.getParameter("homework_content"));
        sh.setCreateTime(new Date());
        this.studentHomeworkService.insert(sh);
        resp.getWriter().println("提交作业成功");
        //设置2秒钟跳转
        resp.setHeader("refresh", "2;url=/studentHomework/list");
    }

    @RequestMapping("/list")
    public void listStudentHomework(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StudentHomework> list = this.studentHomeworkService.queryAll();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/listjsp").forward(req,resp);
    }

    @RequestMapping("/update")
    public void updateStudentHomework(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        sh.setStudentId(Long.parseLong(req.getParameter("student_id")));
        sh.setHomeworkId(Long.parseLong(req.getParameter("homework_id")));
        sh.setHomeworkTitle(req.getParameter("homework_title"));
        sh.setHomeworkContent(req.getParameter("homework_content"));
        sh.setCreateTime(new Date());
        this.studentHomeworkService.update(sh);
        resp.getWriter().println("修改作业成功");
        //设置2秒钟跳转
        resp.setHeader("refresh", "2;url=/studentHomework/list");
    }
}