<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="UpLoad?action=uploadFile" name="form1" method="post"
		enctype="multipart/form-data">
		请选择上传的文件：<input name="file" type="file" size="42"> <input
			type="button" value="上传" onclick="deal(form1)"> <input
			type="reset" value="重置">
	</form>
	<div id="progressBar" class="prog_border" align="left"></div>
	<span id="processPercent" style="width: 40px; display: none">0%</span>
</body>
<script type="text/javascript" src="../AjaxRequest.js">
	
</script>

<script type="text/javascript">
	function deal(form) {
		form.submit();
		window.setInterval("getProcess()", 500);
	}
	function getProcess() {
		var loader = new net.AjaxRequest("showProgress.jsp?nocache="
				+ new Date().getTime(), deal_p, onerror, "GET");
	}
	function deal_p() {
		var h = this.req.responseText;
		h = h.replace(/\s/g, ""); //去除字符串中的Unicode空白符
		document.getElementById("progressPercent").style.display = "";
		processPercent.innerHTML = h + "%";
		document.getElementById("progressBar").style.display = "block"; //显示可见 (不可见为 ："none")
	}
	function onerror() {

	}
</script>
</html>