package com.java.code.servlet;

import com.java.code.jdbc.StudentHomeworkJdbc;
import com.java.code.model.Homework;
import com.java.code.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/addh")

public class AddHomeworkServlet extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Homework h = new Homework();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        h.setTitle(req.getParameter("homework_title"));
        h.setContent(req.getParameter("homework_content"));
        h.setCreate_time(new Date());
      // System.out.println(new Date());
        //SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(req.getParameter("update_time").replace("T"," ").concat(":00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        h.setUpdate_time(date);
        //System.out.println(req.getParameter("update_time").replace("T"," "));
        //h.setUpdate_time(req.getParameter("update_time"));

        boolean result = StudentHomeworkJdbc.addHomework(h);
        if(result) {
            resp.setHeader("refresh", "2;url=localhost:8080");
            resp.getWriter().println("发布作业成功");

        }else{
            resp.setHeader("refresh", "2;url=/jsp/addhomework.jsp");
            resp.getWriter().println("发布作业失败" );

        }
    }

}