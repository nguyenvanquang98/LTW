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
<title>QuangBoon</title>
<jsp:include page="Common/header_tag.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="Common/Header.jsp"></jsp:include>
	<%@page import="java.text.DecimalFormat"%>

	<div class="container" style="margin-top: 6%; margin-bottom: 1%">
		<br>
		<h2 class="text-center">Danh sách sản phẩm</h2>
		<br>
		<div class="row">
			<%
				List<ProductBox> liB = DAOProduct.listProductBox();
				for (int i = 0; i < liB.size(); i++) {
			%>

			<div class="col-sm-4">
				<div class="card bg-white" style="width: 100%;">
					<img class="card-img-top rounded mx-auto d-block"
						style="width: 200px; height: 230px; margin-top: 5%"
						src="<%=liB.get(i).getImgSP()%>" alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">
							<%=liB.get(i).getTenSP()%>
						</h5>
						<p class="card-text">
						<h5 class="card-title" style="color: #e10c00;">
							<%=liB.get(i).getGiaSP()%></h5>
						<div style="border-bottom: 1px dashed #ccc;"></div>
						<div class="input-container">
							<br> <a href="<%=request.getContextPath()%>/BuyProductLab5?index=<%=i%>">
								<button type="button" class="btn"
									style="width: 49%; color: #f76b1c; border: 1px solid #f76b1c; background: #fff;">Mua
									ngay</button>
							</a>
							<button type="button" class="btn"
								style="width: 49%; color: #288ad6; border: 1px solid #288ad6; background: #fff;">Mua
								trả góp</button>
						</div>
					</div>
				</div>
			</div>
			<%
				}%>
			
		</div>
		<a href="../LogoutLab5"><button class="btn btn-primary"
				type="button" style="margin-left: 46%; margin-top: 1%;">Đăng
				xuất</button></a>
	</div>
	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>
</body>
</html>