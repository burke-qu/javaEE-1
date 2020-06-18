package com.example.homeworkmanagesystem.controller;

import com.example.homeworkmanagesystem.entity.Homework;
import com.example.homeworkmanagesystem.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (Homework)表控制层
 *
 * @author makejava
 * @since 2020-06-18 14:50:38
 */
@Controller
@RequestMapping("homework")
public class HomeworkController {
    /**
     * 服务对象
     */
    @Resource
    private HomeworkService homeworkService;

    @Autowired
    private Homework h;

    @PostMapping("/set")
    public void setHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");//设置编码，以防表单提交的内容乱码
        /**
         * 赋值
         */
        h.setTitle(req.getParameter("homework_title"));
        h.setContent(req.getParameter("homework_content"));
        h.setCreateTime(new Date());

        // System.out.println(new Date());
        //SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(req.getParameter("update_time").replace("T"," ").concat(":00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        h.setUpdateTime(date);

        int result = this.homeworkService.insert(h);
        if(result !=0 ) {
            resp.getWriter().println("发布作业成功");
            resp.setHeader("refresh", "2;url=/homework/list");

        }else{

            resp.getWriter().println("发布作业失败" );
            resp.setHeader("refresh", "2;url=/ahwjsp");
        }

    }

    @GetMapping("/list")
    public void listHomework(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        List<Homework> list = this.homeworkService.queryAll();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/hwjsp").forward(req,resp);
    }

}