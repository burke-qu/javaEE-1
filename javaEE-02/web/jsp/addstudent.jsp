<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/3/12
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
    <style type="text/css">
        fieldset{
            width:300px;
            border:2px solid black;
            padding-left:20px;
        }
    </style>
</head>
<body>
<div align="center">
<form method="post" action="/adds">
    <fieldset align="center">
        学&nbsp;&nbsp;号：<input name="student_id" type="text"/></br>

        姓&nbsp;名：&nbsp;<input name="student_name" type="text"/></br>

        &nbsp;&nbsp;&nbsp;<input name="submit" type="submit" value="添加" />
    </fieldset>
</form>
</div>>
</body>
</html>
