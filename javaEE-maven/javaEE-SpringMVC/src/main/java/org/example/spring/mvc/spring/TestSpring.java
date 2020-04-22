package org.example.spring.mvc.spring;

import org.example.spring.mvc.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//@ComponentScans("org.example.spring.mvc.*")
public class TestSpring {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Student.class);
//        context.register(Student.class);
//        context.scan("org.example.spring.mvc.*");
//        context.refresh();
        //ApplicationContext context = new ClassPathXmlApplicationContext("springmvc-context.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("/javaEE-SpringMVC/src/main/resources/springmvc-context.xml");
        Student student = context.getBean("Student",Student.class);
        System.out.println(student.toString());
    }
}
