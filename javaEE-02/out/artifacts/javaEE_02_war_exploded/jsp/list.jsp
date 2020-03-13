<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/3/12
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.java.code.model.StudentHomework" %>

<%@ page import="java.util.List" %>

<%@ page import="com.java.code.jdbc.StudentHomeworkJdbc" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

    <title>学生作业列表</title>

</head>

<body>

<table align="center" width="960" border="1"

       bgcolor="black" cellpadding="1" cellspacing="1">

    <tr align="center" bgcolor="#7fffd4" height="50">

        <td>ID</td>

        <td>学生学号</td>

        <td>作业编号</td>

        <td>作业标题</td>

        <td>作业内容</td>

        <td>提交时间</td>

    </tr>

    <%
        List<StudentHomework> list = StudentHomeworkJdbc.selectAll();
        if(null == list || list.size() <= 0){
            out.print("None data.");
        }else {
            for (StudentHomework sh : list){
    %>

    <tr align="center" bgcolor="white" height="30">

        <td><%=sh.getId()%></td>

        <td><%=sh.getStudent_Id()%></td>

        <td><%=sh.getHomework_Id()%></td>

        <td><%=sh.getHomework_title()%></td>

        <td><%=sh.getHomework_content()%></td>

        <td><%=sh.getCreate_time()%></td>

    </tr>

    <%
            }
        }
    %>

</table>

</body>

</html>