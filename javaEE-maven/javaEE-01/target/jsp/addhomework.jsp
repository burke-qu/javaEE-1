<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/3/12
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布作业</title>
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
<form method="post" action="/addh">
    <fieldset >
        作业标题:&nbsp;<input name="homework_title" type="text"  /></br>
        作业内容:
        <textarea name="homework_content" cols="30" rows="5"></textarea>
        </br>
        </br>
        截&nbsp;止&nbsp;时&nbsp;间：<input  name="update_time" type="datetime-local" /></br></br></br>
        &nbsp;&nbsp;&nbsp;&nbsp;<input name="submit" type="submit" value="发布" />
    </fieldset>
</form>
</div>
</body>
</html>
