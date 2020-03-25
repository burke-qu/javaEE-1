package org.example.javaee.class01.jdbc;

import org.example.javaee.class01.model.Homework;
import org.example.javaee.class01.model.Student;
import org.example.javaee.class01.model.StudentHomework;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class StudentHomeworkJdbc {
    private static String url = "jdbc:mysql://127.0.0.1:3306/school";
    private static String allUrl = url + "?user=root&password=209999girl&useSSL=false&serverTimezone=UTC";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
//    public static void main(String[] args) {
//
//        List<StudentHomework> list = selectAll();
//
//        for (StudentHomework sh : list){
//            System.out.println(sh.getHomework_content());
//        }
//    }

    public static boolean addStudentHomework(StudentHomework sh){
       //
        String sqlString = "insert into s_student_homework(student_id,homework_id,homework_title,homework_content,create_time)" +
                "values(?,?,?,?,?)";
//                +"," + sh.getStudent_Id()
//                +"," + sh.getHomework_Id()
//                +"," + sh.getHomework_title()
//                +"," + sh.getHomework_content()
//                +"," + sh.getCreate_time()
//                +","+"null" + ")";
        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(PreparedStatement ps = connection.prepareStatement(sqlString)){
                try{
                    ps.setLong(1,sh.getStudent_Id());
                    ps.setLong(2,sh.getHomework_Id());
                    ps.setString(3,sh.getHomework_title());
                    ps.setString(4,sh.getHomework_content());
                    ps.setTimestamp(5,new Timestamp(sh.getCreate_time().getTime()));
                    // 获取执行结果
                    int result = ps.executeUpdate();
                    if(result != 0) {
                        return true;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean addStudent(Student s){
        String sqlString = "insert into s_student(id,name,create_time)" +
                "values(?,?,?)";
//                + s.getId()
//                +"," + s.getName()
//                +"," + s.getCreate_time()
//                +"," + "null)";
        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(PreparedStatement ps = connection.prepareStatement(sqlString)){
                try{
                    ps.setLong(1,s.getId());
                    ps.setString(2,s.getName());
                    ps.setTimestamp(3,new Timestamp(s.getCreate_time().getTime()));
                    // 获取执行结果
                    int result = ps.executeUpdate();
                    if(result != 0) {
                        return true;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public static boolean addHomework(Homework h){

        String sqlString = "insert into s_homework(title,content,create_time,update_time)" +
                "values(?,?,?,?)";
//
//                +"," + h.getTitle()
//                +"," + h.getContent()
//                +"," + h.getCreate_time()
//                +"," + h.getUpdate_time()+")";
        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(PreparedStatement ps = connection.prepareStatement(sqlString)){
                try{

                    ps.setString(1,h.getTitle());
                    ps.setString(2,h.getContent());
                    ps.setTimestamp(3,new Timestamp(h.getCreate_time().getTime()));
                    ps.setTimestamp(4,new Timestamp(h.getUpdate_time().getTime()));
                    // 获取执行结果
                    int result = ps.executeUpdate();
                    if(result != 0) {
                        return true;
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static List<StudentHomework> selectAll(){
        String url = "jdbc:mysql://127.0.0.1:3306/school";
        String allUrl = url + "?user=root&password=209999girl&useSSL=false&serverTimezone=UTC";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String sqlString = "SELECT * FROM s_student_homework";
        try {
            // 加载驱动
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<StudentHomework> list = new ArrayList<>();
        try(Connection connection =  DriverManager.getConnection(allUrl)) {
            try(Statement statement = connection.createStatement()){
                try(ResultSet resultSet = statement.executeQuery(sqlString)){
                    // 获取执行结果

                    while (resultSet.next()){
                        StudentHomework sh = new StudentHomework();
                        sh.setId(resultSet.getLong("id"));
                        sh.setStudent_Id(resultSet.getLong("student_id"));
                        sh.setHomework_Id(resultSet.getLong("homework_id"));
                        sh.setHomework_title(resultSet.getString("homework_title"));
                        sh.setHomework_content(resultSet.getString("homework_content"));
                        sh.setCreate_time(resultSet.getTimestamp("create_time"));
                        list.add(sh);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }




}