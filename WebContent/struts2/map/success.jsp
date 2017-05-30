<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	request范围内的值时:<%=request.getAttribute("request")%>
	session范围内的值时:<%=session.getAttribute("session")%>
	application范围内的值时:<%=application.getAttribute("application")%>
</body>
</html>