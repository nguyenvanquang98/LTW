<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<jsp:include page="Common/header_tag.jsp"></jsp:include>
<title>Roundy - A Minimal Bootstrap Blogging Tempate</title>
</head>
<body>

	<jsp:include page="Common/Header.jsp"></jsp:include>
	<!-- Hero Section -->
	<div class="container" id="hero">
		<div class="row justify-content-end">
			<div class="col-lg-6 hero-img-container">
				<div class="hero-img">
					<!-- hero img -->
					<img src="./img/quang2.jpg">
				</div>
			</div>

			<div class="col-lg-9">
				<div class="hero-title">
					<h3>
						Hình hài của mẹ cha cho <br>Trí khôn đời dạy, đói no tại
						mình.
					</h3>
				</div>

			</div>
			<!-- hero meta -->
			<div class="col-lg-6">
				<div class="hero-meta">
					<div class="author">
						<div class="author-img">
							<img src="./img/quang3.jpg">
						</div>
						<div class="author-meta">
							<span class="author-name">Nguyễn Văn Quang</span> <span
								class="date mt-2">27/07/1998</span> <span class="author-tag">16130529</span>
							<span class="author-tag">DH16DTA</span> <span class="author-tag">Lập
								trình Web</span>

						</div>
					</div>

					<div class="tags mt-2">
						<a href=""><span class="badge badge-pill p-2 badge-light">#Travel</span></a>
						<a href=""> <span class="badge badge-pill p-2 badge-light">#Flight</span></a>
						<a href=""> <span class="badge badge-pill p-2 badge-light">#Vlogger</span></a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- Content -->
	<!-- Related Article Grid -->

	<div class="container mt-3 mb-5" id="article-grid">
		<div class="row">

			<div class="col-xl-6 col-lg-12 text-center">
				<a href="https://www.facebook.com/chaucaypro2017/">
					<div class="article-card">
						<div class="article-img">
							<img src="./img/senda.jpg">
						</div>

						<div class="article-meta text-left">
							<h2>Chậu Cây Sen Đá Đẹp</h2>
							<p>Chuyên cung cấp chậu cây sen đá tốt nhất đến cho mọi
								người.</p>
						</div>
					</div>
				</a>
			</div>

			<div class="col-xl-6 col-lg-12 text-center">
				<a href="https://www.facebook.com/vnboonboon/">
					<div class="article-card">
						<div class="article-img">
							<img src="./img/gaming.png">
						</div>

						<div class="article-meta text-left">
							<h2>Live Stream Gaming</h2>
							<p>Live stream các tựa game hot mới ra mắt năm 2018.</p>
						</div>
					</div>
				</a>
			</div>

		</div>
	</div>

	<!-- Footer section  -->

	<jsp:include page="Common/footer.jsp"></jsp:include>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<jsp:include page="Common/footer_tag.jsp"></jsp:include>
</body>
</html>