<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<%@ page import="first.servlet.cal.CalServlet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>简易计算器</title>
</head>
<body>
	<!-- <form action="cal.jsp" method="post"> -->
	<form action="CalServlet" method="post"> 
		<input type="text" name="firstParam" value=""> <select
			name="operator">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select> <input type="text" name="secondParam" value=""> = <input
			type="text" value="" disabled="disabled"><br> <input
			type="submit" value="计 算">
	</form>
</body>
</html>