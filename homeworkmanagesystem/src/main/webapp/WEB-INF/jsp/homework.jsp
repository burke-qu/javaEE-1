<%--
  Created by IntelliJ IDEA.
  User: 叶宗保1
  Date: 2020/6/18
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.homeworkmanagesystem.entity.Homework" %>

<%@ page import="java.util.List" %>

<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业列表</title>
</head>
<body>
<table align="center" width="960" border="1"

       bgcolor="black" cellpadding="1" cellspacing="1">

    <tr bordercolor="#ffffff">
        <td colspan="4" height="30px" style="text-align:center"><strong>作业列表</strong> </td>

    </tr>
    <tr align="center" bgcolor="#7fffd4" height="50">

        <td>ID</td>

        <td>作业标题</td>

        <td>作业内容</td>

        <td>创建时间</td>

    </tr>

    <%
        List<Homework> list = (List<Homework>) request.getAttribute("list");
        if(null == list || list.size() <= 0){
            out.print("None data.");
        }else {
            for (Homework h : list){
    %>

    <tr align="center" bgcolor="white" height="30">

        <td><%=h.getId()%></td>

        <td><%=h.getTitle()%></td>

        <td><%=h.getContent()%></td>

        <td><%=h.getCreateTime()%></td>

    </tr>

    <%
            }
        }
    %>

</table>
</body>
</html>
