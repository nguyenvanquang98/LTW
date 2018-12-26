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
<!-- Site Title -->
<title>Lab4 - 16130529</title>
</head>
<body style="">
	<jsp:include page="Common/Header.jsp"></jsp:include>
	<%@page import="java.text.DecimalFormat"%>

	<div class="container" style="margin-top: 6%; margin-bottom: 1%">
		<br>
		<h2 class="text-center">Danh sách sản phẩm</h2>
		<br>
		<table class="table table-striped table-hover">
			<thead style="background: #212529; color: #fff">
				<tr>
					<th>Mã SP</th>
					<th>Tên SP</th>
					<th>Hình ảnh</th>
					<th>Giá ban đầu</th>
					<th>Giá đã giảm</th>
					<th></th>
				</tr>
			</thead>
			<%
				List<Product> li = DAOProduct.getListProduct();
				for (int i = 0; i < li.size(); i++) {
					double perSale = DAOProduct.perSale(li.get(i));
			%>
			<tbody>
				<tr>
					<td><%=li.get(i).getId()%></td>
					<td><%=li.get(i).getName()%></td>
					<td><img style="width: 60px; height: auto;"
						src="<%=li.get(i).getImgUrl()%>"></td>
					<td><%=li.get(i).getPrice()%></td>
					<td><%=perSale%></td>
					<td><a href="<%=request.getContextPath()%>/controllLab4?ID=<%= li.get(i).getId() %>"><button class="btn btn-danger btn-sm" type="submit"
							value="">Xóa</button></td>
				</tr>
			</tbody>
			<%
				}
			%>
		</table>
		<br>
		<h2 class="text-center">Danh sách sản phẩm</h2>
		<br>
		<div class="row">
			<%
				List<ProductBox> liB = DAOProduct.listProduct1();
				for (ProductBox prb : liB) {
			%>

			<div class="col-sm-4">
				<div class="card bg-white" style="width: 100%;">
					<img class="card-img-top rounded mx-auto d-block" style="width:200px;height:230px;margin-top:5%" src="<%=prb.getImgSP()%>"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">
							<%=prb.getTenSP()%>
						</h5>
						<p class="card-text">
						<h5 class="card-title" style="color: #e10c00;">
							<%=prb.getGiaSP()%></h5>
						</p>
						<div style="border-bottom: 1px dashed #ccc;">
						</div>
						<div class="input-container">
						<br>
                    <button type="button" class="btn" style="width: 49%;color: #f76b1c;border: 1px solid #f76b1c;background: #fff;">Mua ngay</button>
                        <button type="button" class="btn" style="width: 49%;color: #288ad6;border: 1px solid #288ad6;background: #fff;">Mua trả góp</button>
                </div>
						
					</div>
				</div>
			</div>
			<%
				}
			%>
		</div>
	</div>
	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>

</body>
</html>