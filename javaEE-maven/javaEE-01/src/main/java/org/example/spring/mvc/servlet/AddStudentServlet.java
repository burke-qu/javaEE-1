package org.example.spring.mvc.servlet;

import org.example.spring.mvc.jdbc.StudentHomeworkJdbc;
import org.example.spring.mvc.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@WebServlet("/adds")

public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = new Student();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        s.setId(Long.parseLong(req.getParameter("student_id")));
        s.setName(req.getParameter("student_name"));
        s.setCreate_time(new Date());

        boolean result = StudentHomeworkJdbc.addStudent(s);
        if(result) {
            resp.getWriter().println("添加学生成功");
            //设置3秒钟跳转
            resp.setHeader("refresh", "2;url=/");
        }else{
            resp.getWriter().println("添加学生失败" );
            resp.setHeader("refresh", "2;url=/jsp/addstudent.jsp");
        }
    }
}