<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/6/18
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老师</title>
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
    <form>
        <fieldset>
            <legend align="left">老师</legend>
            <a href="/homework/list"><input type="button" name="1" onclick="" value="查看发布的作业"/></a>
            </br>
            </br>
            <a href="/studentHomework/list"><input type="button" name="2" onclick="" value="查看学生作业"/></a>
            </br>
            </br>
            <a href="/ahwjsp"><input type="button" name="3" onclick="" value="添加作业"/></a>
            </br>
            </br>
        </fieldset>
    </form>
</div>
</body>
</html>
