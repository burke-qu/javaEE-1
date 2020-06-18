package com.example.homeworkmanagesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    //register.jsp
    @GetMapping(value = "/rgjsp")
    public String rgjsp()
    {
        return "register";
    }

    //student.jsp
    @GetMapping(value = "/student")
    public String stdjsp()
    {
        return "student";
    }

    //teacher.jsp
    @GetMapping(value = "/teacher")
    public String tchjsp()
    {
        return "teacher";
    }

    //login.jsp
    @GetMapping(value = "/lgjsp")
    public String lgjsp()
    {
        return "login";
    }

    //list.jsp
    @GetMapping(value = "/listjsp")
    public String listjsp()
    {
        return "list";
    }

    //addhomework.jsp
    @GetMapping(value = "/ahwjsp")
    public String ahwjsp()
    {
        return "addhomework";
    }

    //submit.jsp
    @GetMapping(value = "/subjsp")
    public String subjsp()
    {
        return "submit";
    }

    //homework.jsp
    @GetMapping(value = "/hwjsp")
    public String hwjsp()
    {
        return "homework";
    }

    //updatehomework.jsp
    @GetMapping(value = "/updatejsp")
    public String updatejsp()
    {
        return "updatehomework";
    }
}
