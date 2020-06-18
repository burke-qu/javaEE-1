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
    <title>提交作业</title>
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
<form method="post" action="/studentHomework/submit">
    <fieldset>
        学&nbsp;&nbsp;号：<input name="student_id" type="text" required/></br>

        作&nbsp;业&nbsp;编&nbsp;号：&nbsp;<input name="homework_id" type="text" required/></br>

        标&nbsp;&nbsp;&nbsp;题 &nbsp;&nbsp;&nbsp;<input name="homework_title" type="text" required/></br>

        <textarea name="homework_content" cols="30" rows="5">作业内容</textarea>
        </br>
        </br>
        </br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交" />
    </fieldset>
</form>
</div>
</body>
</html>
