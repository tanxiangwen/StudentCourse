<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ page import="test.vo.*"%>--%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>成绩录入</title>
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
		#ind{
			color:#4169E1;
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
								<a href="TeaQueryByTidServlet?tid=<%=(String)session.getAttribute("id")%>">个人信息</a><hr>
								</li>
								<li>
								<a href="teacherMod.jsp">密码修改</a><hr>
								</li>
								<li>
								<a href="TeaAllCourseQueryServlet?tid=<%=(String)session.getAttribute("id")%>">录入成绩</a><hr>
								</li>
								<li>
								<a href="TeaLookcourseQueryServlet?tid=<%=(String)session.getAttribute("id")%>">查询选课</a><hr>
								</li>
								<li>
								<a href="classroom.jsp">查询教室</a><hr>
								</li>
								<li>
								<a href="TeaDeleteServlet?tid=<%=(String)session.getAttribute("id")%>">注销</a><hr>
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
							String info=(String)request.getAttribute("error");
							if(info!=null){
								if(info.equals("addError")){
									out.print("录入失败！");
								}
								else if(info.equals("addSuccess")){
									out.print("录入成功！");
								}
								else{
									//不需要处理
								}
							}
						%>
						<%
							String sid=request.getParameter("sid");
							String cid=request.getParameter("cid");
						%>
						<form action="TeaAddGradeServlet?sid=<%=sid%>&cid=<%=cid%>" method="post">
								<center><h4>成绩录入</h4></center>
								<table width="600" align="center">
								<tr>
									<td>学号:<input type="text"name="id"> </td>
									<td>成绩</td>
									<td><input type="text" name="ack"></td>		
								</tr>
								<tr>
								<td></td>
								<td><input type="submit" value="确认"></td>
								</tr>
								</table>
						</form>
					</div>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>