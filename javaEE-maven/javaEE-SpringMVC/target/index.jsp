<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/3/12
  Time: 18:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

  <title>作业管理系统</title>
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
    <a href="/list"><input type="button" name="1" onclick="" value="查看学生作业"/></a>
    </br>
    </br>
    <a href="/jsp/addhomework.jsp"><input type="button" name="2" onclick="" value="添加作业"/></a>
    </br>
    </br>
    <a href="/jsp/addstudent.jsp"><input type="button" name="3" onclick="" value="添加学生"/></a>

<%--    用户名：<input name="name" type="text"/></br>--%>
<%--    &nbsp;密&nbsp;&nbsp;码：&nbsp;<input name="password" type="password"/></br>--%>
<%--    类&nbsp;&nbsp;&nbsp;型 &nbsp;&nbsp;&nbsp;<input name="user" type="radio" value="管理员" checked="checked"/>管理员 &nbsp; <input name="user" type="radio" value="普通用户" />普通用户</br>--%>
<%--    &nbsp;&nbsp; <input name="remember" type="checkbox" value="记住密码" />记住密码 <input name="autologin" type="checkbox" value="自动登录" />自动登录</br>--%>
<%--    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="submit" type="submit" value="提交" /> &nbsp;&nbsp;&nbsp;<input name="reset" type="reset" value="重置" />--%>
  </fieldset>
</form>
  </br></br></br>

<form>
  <fieldset>
    <legend align="left">学生</legend>
    <a href="/jsp/submit.jsp"> <input type="button" name="4" onclick="" value="提交作业"/></a>
  </fieldset>
</form>
</div>

</body>

</html>