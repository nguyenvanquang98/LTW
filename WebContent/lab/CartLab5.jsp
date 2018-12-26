<%@page import="DAO.DAOProduct"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ProductBox"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="Common/header_tag.jsp"></jsp:include>
<title>Lab5 - 16130282</title>
</head>
<body>
	<jsp:include page="Common/Header.jsp"></jsp:include>
	<%@page import="java.text.DecimalFormat"%>

	<div class="container" style="margin-top: 6%; margin-bottom: 1%">
		<br> <a href="lab5.jsp"><button
				class="btn btn-primary" type="button"
				style="margin-left: 42.5%;margin-bottom:1%;">Tiếp tục mua hàng</button></a>
		<h2 class="text-center">Danh sách sản phẩm</h2>
		<br>
		<table class="table table-striped table-hover">
			<thead style="background: #212529; color: #fff">
				<tr>
					<th>STT</th>
					<th>Mã SP</th>
					<th>Tên SP</th>
					<th>Hình ảnh</th>
					<th>Giá</th>
					<th></th>
				</tr>
			</thead>
			<%
				List<ProductBox> li = DAOProduct.getListProductBox();
				int count = 0;
				for (int i = 0; i < li.size(); i++) {
					count++;
			%>
			<tbody>
				<tr>
					<td><%=count%></td>
					<td><%=li.get(i).getMaSP()%></td>
					<td><%=li.get(i).getTenSP()%></td>
					<td><img style="width: 60px; height: auto;"
						src="<%=li.get(i).getImgSP()%>"></td>
					<td><%=li.get(i).getGiaSP()%></td>
					<td><a href="<%=request.getContextPath()%>/DeleteLab5?ID=<%=i%>"><button
								class="btn btn-danger btn-sm" type="submit" value="">Xóa</button></td>
				</tr>
			</tbody>
			<%
				}
			%>
		</table>
	</div>
	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>
</body>
</html>