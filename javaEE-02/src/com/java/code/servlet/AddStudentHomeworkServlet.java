package com.java.code.servlet;

import com.java.code.jdbc.StudentHomeworkJdbc;
import com.java.code.model.StudentHomework;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@WebServlet("/addsh")

public class AddStudentHomeworkServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentHomework sh = new StudentHomework();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**

         * 赋值

         */
        sh.setStudent_Id(Long.parseLong(req.getParameter("student_id")));
        sh.setHomework_Id(Long.parseLong(req.getParameter("homework_id")));
        sh.setHomework_title(req.getParameter("homework_title"));
        sh.setHomework_content(req.getParameter("homework_content"));
        sh.setCreate_time(new Date());
        StudentHomeworkJdbc.addStudentHomework(sh);

        resp.sendRedirect("/list");

    }

}