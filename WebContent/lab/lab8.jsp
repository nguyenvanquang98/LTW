<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">

<jsp:include page="Common/header_tag.jsp"></jsp:include>
<title>Quang-16130529</title>
</head>
<body>
	<jsp:include page="Common/Header.jsp"></jsp:include>
	<form action="<%=request.getContextPath()%>/ControllLab8" method="post"
		enctype="multipart/form-data">
		<div style="text-align: center;">
			<br> Select File <br> <input type="file" name="fname" /><br />
			<input type="submit" value="upload" />
		</div>
	</form>

	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>
</body>

</html>
