<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
	<%--<%@include file="common/link.jsp"%>--%>
	<base href="http://localhost:8080/JavaWebWork/">;
</head>
<body BACKGROUND="WebContent/p.jpg">

	<form action="loginServlet?action=login" method="post">
		<br/>
		<br/>
		<br/>
		<br/>
		<table width="300" border="0" align="center">
			<tr>
				<center><h1>欢迎您使用学生选课系统</h1></center>	
				<br/>
				<br/>
			</tr>
  			<tr>
    			<td>用户ID：</td>
   				<td><input name="userid" type="text" size="20" maxlength="30" value="${empty requestScope.userid?"":requestScope.userid}"></td>
  			</tr>
  			<tr>
    			<td>密码：</td>
    			<td><input name="userpass" type="password" size="20" maxlength="30"></td>
    		</tr>
  			<tr>
    			<td>用户类型：</td>
    			<td>
      				<select name="userselect">
        				<option value="student" selected>学生</option>
        				<option value="teacher">教师</option>
        				<option value="admin">管理员</option>
      				</select>
      			</td>
  			</tr>
  			<tr>
  				<td><input type="submit" value="登录"></td>
  			</tr>
		</table>
	</form>
</body>
</html>