<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>通过cookie保存读取用户登录信息</title>
</head>
<body>
	<%
		Cookie[] cookie = request.getCookies();
		String user = "";
		String date = "";
		if (cookie != null) {
			for (int i = 0; i < cookie.length; i++) {
				if (cookie[i].getName().equalsIgnoreCase("mm")) {
					user = URLDecoder.decode(cookie[i].getValue().split("#")[0]);
					date = cookie[i].getValue().split("#")[1];
				}
			}
		}
		if ("".equals(user) && "".equals(date)) {
	%>
	游客您好，欢迎您初次光临！
	<form action="deal.jsp" method="post">
		请输入姓名：<input name="user" type="text" value=""> <input
			type="submit" value="确定">
	</form>
	<%
		} else {
	%>
	欢迎[
	<b><%=user%></b>]再次光临
	<br> 您注册时时间是：<%=date%>
	<%
		}
	%>
</body>
</html>