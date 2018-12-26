<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="Common/header_tag.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="./css/util.css">
<link rel="stylesheet" type="text/css" href="./css/mainlogin.css">
<title>Login</title>
</head>
<body>
	<jsp:include page="Common/Header.jsp"></jsp:include>
	<!-- start banner Area -->
	
	<!-- End banner Area -->

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-50 p-b-90">
				<form action="../BuyProductLab5" method="post"
					class="login100-form validate-form flex-sb flex-w">
					<span class="login100-form-title p-b-51"> Login </span>


					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Username is required">
						<input class="input100" type="text" name="username"
							placeholder="Username(quang)"> <span
							class="focus-input100"></span>
					</div>


					<div class="wrap-input100 validate-input m-b-16"
						data-validate="Password is required">
						<input class="input100" type="password" name="password"
							placeholder="Password(quang)"> <span
							class="focus-input100"></span>
					</div>

					<div class="flex-sb-m w-full p-t-3 p-b-24">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox"
								name="remember-me"> <label class="label-checkbox100"
								for="ckb1"> Remember me </label>
						</div>

						<div>
							<a href="SignUp.jsp" class="txt1"> Sign Up </a> - <a href="#"
								class="txt1"> Forgot? </a>
						</div>
					</div>

					<div class="container-login100-form-btn m-t-17">
						<button class="login100-form-btn">Login</button>
					</div>

				</form>
			</div>
		</div>
	</div>

	<div id="dropDownSelect1"></div>

	<jsp:include page="Common/footer.jsp"></jsp:include>
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>

</body>
</html>