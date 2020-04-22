package org.example.spring.mvc.Controller;

import org.example.spring.mvc.bean.Homework;
import org.example.spring.mvc.bean.Student;
import org.example.spring.mvc.bean.StudentHomework;
import org.example.spring.mvc.jdbc.StudentHomeworkJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class AllController {
    @Autowired
    private Homework h;

    @Autowired
    private Student s;

    @Autowired
    private StudentHomework sh;

    @Autowired
    private StudentHomeworkJdbc studentHomeworkJdbc;

    @RequestMapping(value = "/addh",method = RequestMethod.POST)
    public void addhomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Homework h = new Homework();
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

        boolean result = studentHomeworkJdbc.addHomework(h);
        if(result) {
            resp.setHeader("refresh", "2;url=localhost:8080");
            resp.getWriter().println("发布作业成功");

        }else{
            resp.setHeader("refresh", "2;url=/jsp/addhomework.jsp");
            resp.getWriter().println("发布作业失败" );

        }
    }

    @RequestMapping(value = "/addsh",method = RequestMethod.POST)
    public void AddStudentHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //StudentHomework sh = new StudentHomework();
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
        studentHomeworkJdbc.addStudentHomework(sh);
        resp.sendRedirect("/list");
    }

    @RequestMapping(value = "/adds",method = RequestMethod.POST)
    public void AddStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        //Student s = new Student();
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        s.setId(Long.parseLong(req.getParameter("student_id")));
        s.setName(req.getParameter("student_name"));
        s.setCreate_time(new Date());

        boolean result = studentHomeworkJdbc.addStudent(s);
        if(result) {
            resp.getWriter().println("添加学生成功");
            //设置3秒钟跳转
            resp.setHeader("refresh", "2;url=/");
        }else{
            resp.getWriter().println("添加学生失败" );
            resp.setHeader("refresh", "2;url=/jsp/addstudent.jsp");
        }
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST )
    public void ListStudentHomework1(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<StudentHomework> list = studentHomeworkJdbc.selectAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/jsp/list.jsp").forward(req, resp);
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET )
    public void ListStudentHomework2(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<StudentHomework> list = studentHomeworkJdbc.selectAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/jsp/list.jsp").forward(req, resp);
    }
}
