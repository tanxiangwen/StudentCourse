<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--<%@ page import="test.vo.Course"%>--%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生选课</title>
	<base href="http://localhost:8080/JavaWebWork/">;
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
#page_nav{
	width: 100%;
	height: 10px;
	margin: auto;

	text-align: center;
}
#pn_input {
	width: 30px;
	text-align: center;
}
</style>
	<%--<script type="text/javascript">
			$.getJSON("http://localhost:8080/JavaWebWork/choosecourseServlet","action=chooseAjax",function(data) {
				if(data.s){
					$("#nav-wrapper1").text(data.s1);

				}
			}



		);
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
						<%--<input type="hidden" value="${"chooseMessage"}" id="hidden" />--%>
						<%--<%
							String info=(String)request.getAttribute("error");
							if(info!=null){
								if(info.equals("addError")){
									out.print("选课失败！");
								}
								else if(info.equals("addSuccess")){
									out.print("选课成功！");
								}
								else{
									//不需要处理
								}
							}
						%>--%>
						<%--<%
							try{
								//获取request域中的数据
								List<Course> courses=(List<Course>)request.getAttribute("courses");
								Iterator<Course> iter=courses.iterator();
						%>--%>
							<%--<%
								String message=(String)request.getAttribute("chooseMessage");
								if(message!=null) {
									if (message.equals("addError")) {
										out.print("你已经选择该课程不能重复选择!");
									} else if (message.equals("fullperson")) {
										out.print("该课程人已满");
									} else {

									}
								}
							%>--%>
								<table width="500" align="center" cellspacing="0">
									<tr><th colspan="7" height="40" bgcolor="tan">学生选课</th></tr>
									<tr>
										<td height="30" bgcolor="bisque">课程名称</td>
										<td height="30" bgcolor="wheat">学分</td>
										<td height="30" bgcolor="bisque">学时</td>
										<td height="30" bgcolor="wheat">上课地点</td>
										<td height="30" bgcolor="bisque">教师</td>
										<td height="30" bgcolor="wheat">剩余可选人数</td>
										<td height="30" bgcolor="bisque">操作</td>
									</tr>

					<%--	<%
									while(iter.hasNext()){
										Course course=iter.next();

						%>--%>
									<%
										String s=(String)request.getAttribute("chooseMessage");%>
									<%if("full".equals(s)){%>

									<script type="text/javascript">
										$(function(){
											alert("该课程人数已满");

										});


									</script>

									<%}else if("chooseMessageerror".equals(s))%><%{%>
									<script type="text/javascript">
										$(function(){
											alert("你已经选择该课程，不要重复选择");

										})

									</script>
									<%}%>


									<c:forEach items="${requestScope.course.items}" var="course">
										 <tr>
											 <td height="30" bgcolor="wheat">${course.cName}</td>
											 <td height="30" bgcolor="beige">${course.credit}</td>
											 <td height="30" bgcolor="wheat">${course.period}</td>
											 <td height="30" bgcolor="beige">${course.cPlace}</td>
											 <td height="30" bgcolor="wheat">${course.tName}</td>
											 <td height="30" bgcolor="beige">${course.cNumNow}</td>
											 <td height="30" bgcolor="wheat">
												 <a href="choosecourseServlet?action=choose&cId=${course.cId}" id="chose">选择</a></td>
										 </tr>
									 </c:forEach>
								</table>



					</div>
						<div id="page_nav">
							<c:if test="${requestScope.course.pageNo>1}">
								<a href="courseServlet?action=QueryByPage&pageNo=1">首页</a>
								<a href="courseServlet?action=QueryByPage&pageNo=${requestScope.course.pageNo-1}">上一页</a>

							</c:if>



							<a href="courseServlet?action=QueryByPage&pageNo=3">3</a>
							【${requestScope.course.pageNo}】
							<a href="courseServlet?action=QueryByPage&pageNo=5">5</a>
							<c:if test="${requestScope.course.pageNo<=requestScope.course.pageTotal}">
								<a href="courseServlet?action=QueryByPage&pageNo=${requestScope.course.pageNo+1}">下一页</a>
								<a href="courseServlet?action=QueryByPage&pageNo=${requestScope.course.pageTotal}">末页</a>

							</c:if>
							共${requestScope.course.pageTotal}页，${requestScope.course.pageTotalCount}条记录 到第<input name="pn" id="pn_input" width="50px"/>页
							<input type="button" id="confirm" value="确定">
						</div>
						<script type="text/javascript">
							$(function(){
								$("#confirm").click(function(){
									//获取输入框内容
									var pageNo=$("#pn_input").val();
									location.href="${pageScope.path}courseServlet?action=QueryByPage&pageNo="+pageNo;
								})
							})
						</script>
					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>

</body>
</html>