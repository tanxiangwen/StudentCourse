<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生</title>
	<%@include file="common/link.jsp"%>
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
	  padding-left: 7px;
	  padding-top:20px;
	}

	#middle{
		display:table;
		table-layout:fixed;
		
		margin-top:0;
		width:100%;
		heigth:950px;
	}
	#nav-wrapper{
		margin-top: 2px;
		padding: 0.75em;
		background-color:#87CEFA;
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
		background-color:#ADD8E6;
		border-left: 1px solid #bbb;
		border-bottom: 1px solid #bbb;
		font-size: 10pt;
		border-bottom-left-radius: 0px;
		box-shadow: 0 0 5px #aaa;
		heigth:500px;
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
			color:#8B4513;
		}
		#hea{
			color:white;
		}
</style>
</head>
<body background="login.jpg">
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
										<a href="WebContent/adminMod.jsp">密码修改</a><hr>
									</li>
									<li>
										<a href="WebContent/addstudent.jsp">添加学生</a><hr>
									</li>
									<li>
										<a href="WebContent/addteacher.jsp">添加老师</a><hr>
									</li>
									<li>
										<a href="adminServlet?action=queryStu">查询学生</a><hr>
									</li>
									<li>
										<a href="adminServlet?action=queryTea">查询老师</a><hr>
									</li>
									<li>
										<a href="WebContent/addcourse.jsp">开课</a><hr>
									</li>
									<li>
										<a href="loginServlet?action=loginOut">注销</a><hr>
									</li>
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
							String info=(String)request.getAttribute("error");
							if(info!=null){
								if(info.equals("addError")){
									out.print("添加失败！");
								}
								else if(info.equals("addSuccess")){
									out.print("添加成功！");
								}
								else{
								//不需要处理
								}
							}
						%>--%>
							<%--<%
								String s=(String)session.getAttribute("addError");%>
							<%if("addError".equals(s)){%>

							<script type="text/javascript">
								$(function(){
									alert("学生信息有误，请仔细检查");
									return false;
								});


							</script>
							<%{%>--%>

							<%--<%}/*else *//*if("你已经选择该课程，不要重复选择".equals(s))*//*%><%{%>--%>
							<%--<script type="text/javascript">
								$(function(){
									alert("添加成功");
									return true;
								})

							</script>--%>
							<%--<%}%>*/--%>




							<center>
						<form action="adminServlet?action=addStu" method="post">
						<h4>添加学生</h4>	
							<table width="600" align="center" cellspacing="0">
								<tr>
									<td>学号：</td>
									<td><input type="text" name="sId"></td>
								</tr>
								<tr>
									<td>姓名：</td>
									<td><input type="text" name="sName"></td>
								</tr>
								<tr>
									<td>初始密码：</td>
									<td><input type="text" name="sPass"></td>
								</tr>
								<tr>
									<td>院系：</td>
									<td><input type="text" name="dId"></td>
								</tr>
								<tr>
									<td>性别：</td>
									<td><input type="text" name="sSex"></td>
								</tr>
								<tr>
									<td>手机号码：</td>
									<td><input type="text" name="sMobil"></td>
								</tr>
								<tr>
									<td>地址：</td>
									<td><input type="text" name="sAddress"></td>
								</tr>
								<tr><td><input type="submit" value="确认" id="submitAdd"/></td></tr>
							</table>	
						</form>


							</center>
							<%
								String s=(String)request.getAttribute("addError");%>
							<%if("addError".equals(s)){%>

							<script type="text/javascript">
								$(function(){

										alert("学生信息有误，请仔细检查");
										return false;

									/*alert("学生信息有误，请仔细检查");
                                    return false;*/
								});


							</script>

							<%}else if("addexact".equals(s))%><%{%>
							<script type="text/javascript">
								$(function(){

										alert("添加成功");
										return true;


								});

							</script>
							<%}%>
					</div>

					</nav>
					</div>
				</div>
			</div>
		</main>
	</div>
</body>
</html>