<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>

	<base href="http://localhost:8080/JavaWebWork/">;
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
		background-color:#6495ED;
		margin-top:0;
		width:100%;
		heigth:950px;
	}
	#nav-wrapper{
		margin-top: 2px;
		padding: 0.75em;
		background-color:#ADD8E6;
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
		background-color:#DDA0DD;
		border-left: 1px solid #bbb;
		border-bottom: 1px solid #bbb;
		font-size: 10pt;
		border-bottom-left-radius: 0px;
		box-shadow: 0 0 5px #aaa;
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

		}
		#ind{
			color:#00458c;
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
								<%@include file="common/StuContent.jsp"%>
							<%--<ul>
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
								<a href="courseServlet?action=courseShow">选课</a><hr>
								</li>
								<li>
								<a href="loginServlet?action=loginOut">注销</a><hr>
								</li>
							</ul>--%>
							<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
							</div>
						</nav>
					</div>
				</div>
				<div id="mainRight">
					<div id="nav-wrapper1">
					<nav>
					<div>
						<h3>欢迎进入学生选课系统</h3>
						<div class="text">
							<br>
							<br>
							<br>
							<br>
							<h2 align="center" id="ind">学生选课界面</h2>
							<br>
							<br>
							<br>
							<br>
							<%--<%
								String info = (String) request.getAttribute("error");
								if (info != null) {
									if (info.equals("deleteError")) {
										out.print("注销失败!");
									} else {
										//不需要处理
									}
								}
							%>			--%>
							<br>
						</div>
					</div>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>