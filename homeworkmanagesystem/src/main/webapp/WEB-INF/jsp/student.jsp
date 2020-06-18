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
    <title>学生</title>
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
            <legend align="left">学生</legend>
            <a href="/homework/list"><input type="button" name="1" onclick="" value="查看作业"/></a>
            </br>
            </br>
            <a href="/subjsp"> <input type="button" name="2" onclick="" value="提交作业"/></a>
            </br>
            </br>
            <a href="/updatejsp"> <input type="button" name="3" onclick="" value="修改作业"/></a>
        </fieldset>
    </form>
</div>
</body>
</html>
