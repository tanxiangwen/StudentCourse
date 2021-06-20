<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ page import="test.vo.*"%>--%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>教师密码修改</title>
	<base href="http://localhost:8080/JavaWebWork/">;
	<%@include file="common/link.jsp"%>
<style type="text/css">
body, input {
  font-family: 'Open Sans', sans-serif;
  font-size: 10.5pt;
}
table {
  border-collapse: collapse;
  text-align: left;
}
	#middle > div { display: table-row; }
	#middle > div > div { display: table-cell; vertical-align: top; }

	#mainLeft {
	  width: 190px;
	  transition: width 0.4s;
	  height:400px;
	  padding-left: 7px;
	  padding-top:20px;
	}

	#middle{
		display:table;
		table-layout:fixed;
		background-color:#FF69B4;
		margin-top:0;
		width:100%;
		heigth:950px;
	}
	#nav-wrapper{
		margin-top: 2px;
		padding: 0.75em;
		background-color:#9370DB;
		border-right: 1px solid #bbb;
		border-bottom: 1px solid #bbb;
		font-size: 10pt;
		border-bottom-right-radius: 0px;
		box-shadow: 0 0 5px #aaa;
		heigth:400px;
	}
	#nav-wrapper1{
		margin-top: 2px;
		padding: 0.75em;
		background-color:#F5DEB3;
		border-left: 1px solid #bbb;
		border-bottom: 1px solid #bbb;
		font-size: 10pt;
		border-bottom-left-radius: 0px;
		box-shadow: 0 0 5px #aaa;
		height:500px;
	}
	#mainLeft h2 {
		  margin-bottom: 0.2em;
		  font-size: 1.2em;
		}

		#mainLeft ul {
		  padding: 0;
		  margin: 0;
		  list-style-type: none;
		  background-color:white;
		}

		#mainLeft ul a {
		  text-indent: -0.6em;
		  padding-left: 1.4em;
		  display: block;
		  text-decoration: none;
		  color: #444;
		}
		#mainRight {
		  padding-left: 14px;
		  padding-right: 15px;
		  padding-top:20px;
		  text-indent: 0.6em;

		}
		#hea{
			color:white;
		}
</style>
</head>
<body>
	<div id="wrapper">
		<main id="middle">
			<div>
				<div id="mainLeft">
					<div id="nav-wrapper">
						<nav>
							<div>
							<h2 id="hea">学生选课系统</h2><br>
								<ul>
									<li>
										<a href="teacherServlet?action=Infomation">个人信息</a><hr>
									</li>
									<li>
										<a href="WebContent/teacherMod.jsp">密码修改</a><hr>
									</li>
									<li>
										<a href="teacherServlet?action=showCourseStu">录入成绩</a><hr>
									</li>
									<li>
										<a href="teacherServlet?action=select">查询选课</a><hr>
									</li>
									<li>
										<a href="teacherServlet?action=classroom">查询教室</a><hr>
									</li>
									<li>
										<a href="loginServlet?action=loginOut">注销</a><hr>
									</li>
								</ul>
							<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
							</div>
						</nav>
					</div>
				</div>
				<div id="mainRight">
					<div id="nav-wrapper1">
					<nav>
					<div>
						<%
							String message=(String)request.getAttribute("error");
							if(message!=null){
								out.print("两次输入密码不正确");
							}
						%>

						<center>
						<form action="teacherServlet?action=updatePsw" method="post">
							<table width="600" align="center" cellspacing="0">
								<tr><th colspan="2" height="40" bgcolor="orange">教师登录密码修改</th></tr>
								<tr>
									<td height="30" bgcolor="yellow">新密码：</td>
									<td height="30" bgcolor="yellow"><input type="password" name="pass1" id="pass1"></td>
								</tr>
								<tr>
									<td height="30" bgcolor="yellow">再次输入新密码：</td>
									<td height="30" bgcolor="yellow"><input type="password" name="pass2" id="pass2"></td>
									<td><h5 id="error" style="color: red"></h5></td>
								</tr>
								<tr><td height="30" colspan="2" bgcolor="yellow"><input type="submit" value="确认" id="submit"/></td></tr>
							</table>	
						</form>
						</center>
					</div>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>