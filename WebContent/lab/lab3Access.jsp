<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="Common/header_tag.jsp"></jsp:include>
<link rel="stylesheet" href="./css/form-lab3.css">
<!-- Site Title -->
<title>Lab3 - 16130529</title>
</head>
<body style="background: #e3e3e3">
	<jsp:include page="Common/Header.jsp"></jsp:include>


	<%
		if (session.getAttribute("email1") == null) {
	%>
	<jsp:forward page="lab3.jsp"></jsp:forward>
	<%
		} else {
	%>
	<h1 class="text-success"
		style="margin-left: 30%; margin-top: 20%; margin-bot: 20%;">
		Chúc mừng bạn đã đăng ký thành công <i class="fa fa-check"
			style="font-size: 30px;"></i>
	</h1>
	<%
		}
	%>



	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>

</body>
</html>