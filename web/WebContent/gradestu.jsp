<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ page import="test.vo.*"%>--%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>选课学生</title>
	<%@include file="common/link.jsp"%>
<style type="text/css">
	td{text-align:center}
</style>
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
	<script type="text/javascript">
      /* $(function(){
       	$("#aa").change(function(){
       		var grade=this.value;
       		if(confirm("确定输入分数正确?")){
       			$("#aa").text();
			}else{
       			this.value=this.defaultValue;
			}

		});
	   });*/
	</script>
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
						<%--<%
							try{
								//获取request域中的数据
								String cid=(String)request.getAttribute("cid");
								List<Student> students=(List<Student>)request.getAttribute("students");
								Iterator<Student> iter=students.iterator();
						%>--%>
						<script type="text/javascript">

						</script>
								<center><h4>选修学生查询结果</h4></center>
								<table width="600" border="1" align="center">
								<tr>
									<th>学号</th>
									<th>姓名</th>
									<th>科目</th>
									<th>成绩</th>
									<th>操作</th>
								</tr>

									<c:forEach items="${sessionScope.teacherSelectCourses}" var="course">
										<tr>
											<td>${course.sId}</td>
											<td>${course.sName}</td>
											<td>${course.cName}</td>
											<td><input type="text" name="grade" id="aa" value="${course.grade}" onchange="a()"> </td>
											<td><a href="teacherServlet?action=updateGrade&sId=${course.sId}&cId=${course.cId}" id="addGrade">录入成绩</a></td>
										</tr>


									</c:forEach>

								</table>
						<script type="text/javascript">
							function a(){
								confirm("一经填写无法修改!")
								var innerHTML = document.getElementById("aa").value;
								var url=document.getElementById("addGrade").href;
								document.getElementById("addGrade").href=url+'&grade='+innerHTML;




							}
						</script>


					</div>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>