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

	<div class="container3" style="margin-top: 6%; margin-bottom: 1%">
		<form action="<%=request.getContextPath()%>/controllLab3"
			method="post">
			<div class="roww">

				<h1 style="text-align: center; color: #007f00;">ĐĂNG KÝ</h1>
				<br>
				<h4 style="margin-bottom: 5px">Thông tin đăng nhập</h4>
				<div class="input-group input-group-icon">
					<input type="email" placeholder="Email" name="email"
						value="<%ServletContext ct = getServletContext();
			if ((String) ct.getAttribute("email1") != null) {
				out.print((String) ct.getAttribute("email1"));
			}%>" />
					<div class="input-icon">
						<i class="fa fa-envelope"></i>
					</div>
				</div>

				<h5 style="color: red; font-size: 13px;">
					<%
						ServletContext svt = request.getServletContext();
					%>
					<%=(String) svt.getAttribute("msg4") != null ? (String) svt.getAttribute("msg4") : " "%>
					<%
						svt.removeAttribute("msg4");
					%>

				</h5>

				<div class="input-group input-group-icon">
					<input type="password" placeholder="Mật khẩu" name="pass"
						value="<%ServletContext ct1 = getServletContext();
			if ((String) ct1.getAttribute("pass1") != null) {
				out.print((String) ct1.getAttribute("pass1"));
			}%>" />
					<div class="input-icon">
						<i class="fa fa-key"></i>
					</div>
				</div>
				<h5 style="color: red; font-size: 13px;">
					<%
						ServletContext svt1 = request.getServletContext();
					%>
					<%=(String) svt1.getAttribute("msg3") != null ? (String) svt1.getAttribute("msg3") : " "%>
					<%
						svt1.removeAttribute("msg3");
					%>
				</h5>
				<div class="input-group input-group-icon">
					<input type="password" placeholder="Nhập lại mật khẩu"
						name="repass"
						value="<%ServletContext ct2 = getServletContext();
			if ((String) ct2.getAttribute("repass1") != null) {
				out.print((String) ct2.getAttribute("repass1"));
			}%>" />
					<div class="input-icon">
						<i class="fa fa-key"></i>
					</div>
				</div>

				<h5 style="color: red; font-size: 13px;">
					<%
						ServletContext svt2 = request.getServletContext();
					%>
					<%=(String) svt2.getAttribute("msg5") != null ? (String) svt2.getAttribute("msg5") : " "%>
					<%
						svt2.removeAttribute("msg5");
					%>
					<%-- <%=request.getAttribute("msg5") != null ? request.getAttribute("msg5") : " "%> --%>
				</h5>
			</div>
			<div class="roww">
				<h4 style="margin-top: 10px">Thông tin cá nhân</h4>
				<div class="input-group input-group-icon">
					<input type="text" placeholder="Họ và tên" name="name"
						value="<%ServletContext ct3 = getServletContext();
			if ((String) ct3.getAttribute("name1") != null) {
				out.print((String) ct3.getAttribute("name1"));
			}%>" />
					<div class="input-icon">
						<i class="fa fa-user"></i>
					</div>
				</div>
				<h5 style="color: red; font-size: 13px;">
					<%
						ServletContext svt3 = request.getServletContext();
					%>
					<%=(String) svt3.getAttribute("msg1") != null ? (String) svt3.getAttribute("msg1") : " "%>
					<%
						svt3.removeAttribute("msg1");
					%>
					<%-- <%=request.getAttribute("msg1") != null ? request.getAttribute("msg1") : " "%> --%>
				</h5>
			</div>
			<div class="roww">
				<div class="col-half" style="width: 70%">
					<div class="input-group">
						<select style="width: 30%" name="day">
							<option value="0">Ngày</option>
							<%
								for (int i = 1; i < 32; i++)
									out.print("<option value=" + i + " >" + i + "</option>");
							%>
						</select> <select style="width: 32%" name="month">
							<option value="0">Tháng</option>
							<%
								for (int i = 1; i < 13; i++)
									out.print("<option  value=" + i + ">" + i + "</option>");
							%>
						</select> <select style="width: 38%" name="year">
							<option value="0">Năm</option>
							<%
								for (int i = 1970; i < 2018; i++)
									out.print("<option name=thang value=" + i + ">" + i + "</option>");
							%>
						</select>
					</div>
				</div>
				<div class="col-half" style="width: 30%">
					<div class="input-group">
						<input type="radio" name="gender" value="male" id="gender-male"
							value="<%ServletContext ct4 = getServletContext();
			if ((String) ct4.getAttribute("gender1") != null) {
				out.print((String) ct4.getAttribute("gender1"));
			}%>" />
						<label for="gender-male">Nam</label> <input type="radio"
							name="gender" value="female" id="gender-female" /> <label
							for="gender-female">Nữ</label>
					</div>
				</div>
			</div>
			<div class="input-group input-group-icon">
				<input type="number" placeholder="Số điện thoại" name="phone"
					value="<%ServletContext ct5 = getServletContext();
			if ((String) ct5.getAttribute("phone1") != null) {
				out.print((String) ct5.getAttribute("phone1"));
			}%>" />
				<div class="input-icon">
					<i class="fa fa-phone"></i>
				</div>
			</div>
			<h5 style="color: red; font-size: 13px;">
				<%
					ServletContext svt4 = request.getServletContext();
				%>
				<%=(String) svt4.getAttribute("msg2") != null ? (String) svt4.getAttribute("msg2") : " "%>
				<%
					svt4.removeAttribute("msg2");
				%>
				<%-- <%=request.getAttribute("msg2") != null ? request.getAttribute("msg2") : " "%> --%>
			</h5>
			<div class="input-group input-group-icon">
				<input type="number" placeholder="Số di động" name="yourphone"
					value="<%ServletContext ct6 = getServletContext();
			if ((String) ct6.getAttribute("yourphone1") != null) {
				out.print((String) ct6.getAttribute("yourphone1"));
			}%>" />
				<div class="input-icon">
					<i class="fa fa-phone"></i>
				</div>
			</div>
			<div class="roww">
				<h4 style="margin-top: 10px">Địa chỉ</h4>
				<div class="input-group">
					<select style="width: 34%" name="quocgia">
						<%
							String[] qg = { "Việt Nam", "Thái Lan", "Indonesia", "Malaysia", "Philippines", "Lào", "Campuchia",
									"Đông Timor", "Brunei", "Singapore" };
							for (String quocgia : qg)
								out.print("<option value=\"" + quocgia + "\">" + quocgia + "</option>");
						%>
					</select> <select style="width: 33%" name="tinhthanh">
						<%
							String[] tt = { "TP HCM", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre",
									"Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông",
									"Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Quảng Nam", "Quảng Ngãi",
									"Quảng Ninh", "Cần Thơ", "Đà Nẵng", "Hải Phòng", "Thái Bình", "Hà Nội", "An Giang" };
							for (String tinhthanh : tt)
								out.print("<option value=\"" + tinhthanh + "\">" + tinhthanh + "</option>");
						%>
					</select> <select style="width: 33%" name="quanhuyen">
						<%
							String[] qh = { "Quận 1", "Quận 2", "Quận 3", "Quận 4", "Quận 5", "Quận 6", "Quận 7", "Quận 8", "Quận 9",
									"Quận 10", "Quận 12", "Quận Thủ Đức", "Quận Gò Vấp", "Quận Tân Bình", "Quận Bình Thạnh",
									"Quận Tân Phú", "Quận Bình Tân", "Huyện Củ Chi", "Huyện Bình Chánh", "Huyện Hóc Môn",
									"Huyện Nhà Bè", "Huyện Cần Giờ" };
							for (String quanhuyen : qh)
								out.print("<option value=\"" + quanhuyen + "\">" + quanhuyen + "</option>");
						%>
					</select>
				</div>
				<div class="input-group input-group-icon" style="margin-bottom: 5px">
					<input type="text" placeholder="Địa chỉ nhà" name="diachinha" />
					<div class="input-icon">
						<i class="fa fa-home"></i>
					</div>
				</div>
			</div>
			<div class="roww">
				<div class="input-container">
					<button type="submit" class="btn btn-success" style="width: 49.5%">Đăng
						ký</button>
					<button type="reset" class="btn btn-success" style="width: 49.5%">Xóa
						form</button>
				</div>
			</div>
		</form>
	</div>


	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>

</body>
</html>