<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
</head>
<body>
	escapeXml属性为true时：
	<c:out value="水平线标记<hr>" escapeXml="true"></c:out>
	<br> escapeXml属性为false时：
	<c:out value="水平线标记<hr>" escapeXml="false"></c:out>
</body>
</html>