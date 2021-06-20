<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/6/9
  Time: 14:43
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
<%--http://localhost:8080/JavaWebWork/--%>
  <%
      String path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
     pageContext.setAttribute("path",path);

  %>
<base href="<%=path%>">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>

</body>
</html>
