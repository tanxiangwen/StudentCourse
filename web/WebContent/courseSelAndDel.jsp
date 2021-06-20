<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ page import="test.vo.Course"%>--%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>选课查询及其退选</title>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
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
	<%--<script type="text/javascript">
		$(document).ready(function(){
			$("#delete").on('click', function () {
				confirm("一经选择无法恢复");
			});
		});



	</script>--%>

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
							<%--<%
								String info = (String) request.getAttribute("error");
								if (info != null) {
									if (info.equals("deleteError")) {
										out.print("退选失败！");
									} else if (info.equals("deleteSuccess")) {
										out.print("退选成功！");
									} else if (info.equals("addError")) {
										out.print("选课失败！");
									} else if (info.equals("addSuccess")) {
										out.print("选课成功！");
									} else {
										//不需要处理
									}
								}
							%>--%>
									<table width="500" align="center" cellspacing="0">
										<tr>
											<th colspan="6" height="40" bgcolor="tan">学生选课情况及退选</th>
										</tr>
										<tr>
											<td height="30" bgcolor="bisque">课程名称</td>
											<td height="30" bgcolor="wheat">学分</td>
											<td height="30" bgcolor="bisque">学时</td>
											<td height="30" bgcolor="wheat">上课地点</td>
											<td height="30" bgcolor="bisque">教师</td>
											<td height="30" bgcolor="wheat">操作</td>
										</tr>
										<c:if test="${ not empty sessionScope.showing}">
											<c:forEach items="${sessionScope.showing}" var="show">
												<tr>
													<td height="30" bgcolor="wheat">${show.cName}</td>
													<td height="30" bgcolor="beige">${show.credit}</td>
													<td height="30" bgcolor="wheat">${show.period}</td>
													<td height="30" bgcolor="beige">${show.cPlace}</td>
													<td height="30" bgcolor="wheat">${show.tName}</td>
														<%--  <td height="30" bgcolor="beige">${show.}</td>--%>
													<td height="30" bgcolor="wheat">
														<a href="studentServlet?action=delete&cId=${show.cId}" id="delete" onclick="return confirm('一经选择无法修改,是否继续')">退选</a></td>
												</tr>

											</c:forEach>
										</c:if>
										<c:if test="empty sessionScope.showing}">
											<td height="30" bgcolor="wheat"><a href="courseServlet?action=courseShow">空空如也,同学去选择心仪的课程吧!</a></td>
										</c:if>

										<%--	<tr>
												<td height="30" bgcolor="wheat"></td>
												<td height="30" bgcolor="beige"></td>
												<td height="30" bgcolor="wheat"></td>
												<td height="30" bgcolor="beige"></td>
												<td height="30" bgcolor="wheat"></td>
												<td height="30" bgcolor="beige">
												<a href="">退选</a></td>
											</tr>--%>


									</table>
						</div>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>