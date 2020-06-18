<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/6/18
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
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
<form action="/login" method="post">
    <fieldset>
        <legend align="left">登录</legend>
        用户名：<input name="name" type="text" required/></br>
        &nbsp;密&nbsp;&nbsp;码：&nbsp;<input name="password" type="password" required /></br>
        类&nbsp;&nbsp;&nbsp;型 &nbsp;&nbsp;&nbsp;<input name="user" type="radio" value="老师" />老师 &nbsp; <input name="user" type="radio" value="学生" checked="checked"/>学生</br>
        &nbsp;&nbsp;</br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="登录"/> &nbsp;&nbsp;&nbsp;<a href="/rgjsp"><input type="button" onclick="" value="注册"/></a>
    </fieldset>
</form>
</div>
</body>
</html>
