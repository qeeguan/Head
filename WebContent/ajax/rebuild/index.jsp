<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div
		style="border: 1px solid; height: 50px; width: 200px; padding: 5px;">
		<marquee direction="up" scrollamount="3">
			<div id="showinfo"></div>
		</marquee>
	</div>
</body>
<script type="text/javascript" src="../AjaxRequest.js"></script>
<script type="text/javascript">
	function onerror() {
		alert("操作错误！");
	}
	function getInfo() {
		var loader = new net.AjaxRequest("getinfo.jsp?nocache="
				+ new Date().getTime(), deal_getInfo, onerror, "GET");
	}
	function deal_getInfo() {
		document.getElementById("showinfo").innerHTML = this.req.responseText;
	}
	window.onload = function() {
		getInfo();
		//window.setInterval("getInfo()", 5000);
	}
</script>
</html>