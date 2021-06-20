<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/6/16
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <li>
        <a href="studentServlet?action=stuDetail">个人信息</a><hr>
    </li>
    <li>
        <a href="WebContent/stuMessMod.jsp">密码修改</a><hr>
    </li>
    <li>
        <a href="studentScoreServlet?action=stuGrade">成绩查询</a><hr>
    </li>
    <li>
        <a href="choosecourseServlet?action=showselect">选课查询以及退选</a><hr>
    </li>
    <li>
        <a href="courseServlet?action=QueryByPage">选课</a><hr>
    </li>
    <li>
        <a href="loginServlet?action=loginOut">注销</a><hr>
    </li>
</ul>

</body>
</html>
