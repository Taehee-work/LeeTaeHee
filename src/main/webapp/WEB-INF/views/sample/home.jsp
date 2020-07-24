<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<title>HOME</title>
<!-- css작업후 외부파일에 저장할 위치 -->
<link rel="shortcut icon"
	href="http://edu19.dothome.co.kr/images/favicon/favicon.ico">
<link rel="apple-touch-icon-precomposed"
	href="/images/favicon/home-touch-icon.png">
<link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<link rel="stylesheet" type="text/css" href="/resources/css/user.css">
<style>
.go_top {
	position: fixed;
	right: 20px;
	bottom: 112px;
	text-align: center;
	background: #00ffff;
	z-index: 100;
	padding: 20px;
	opacity: 0.5;
	color: #000000;
}

@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);

body, h1, h2, h3, h4, h5, h6, li, p {
	font-family: "Nanum Gothic", "NanumGothic" !important;
}
/* .logo {height:50px !important;} */
/* .logo img {height:50px !important;} */
</style>
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/common.js"></script>
<!-- 사용자 스크립트 -->
<!-- jQuery(function($){ //j쿼리 시작 : $(document).ready(function(){ }); == $(function(){ }); 과 동일 -->

<script>
</script>
<!-- 부트스트랩 -->
<link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<!-- 더미 데이터:css작업전 내용 -->
	<div id="wrap">
		<header class="header cfixed">
			<h1 class="logo">
				<a href="/"><img src="/resources/images/logo_02.png" alt=""></a>
			</h1>
			<nav>
				<ul class="gnb">
					<li><a href="/">HOME</a></li>
					<li><a href="#weare">WE ARE</a></li>
					<li><a href="#work">WORK</a></li>
					<li><a href="#blog">BLOG</a></li>
					<li><a href="#contactus">CONTACT US</a></li>
				</ul>
			</nav>
			<span class="menu-toggle-btn"> <span></span> <span></span> <span></span>
			</span>
		</header>
		<article class="slider">
			<img src="/resources/images/Peng_03.jpg" alt="">
		</article>
		<section class="content">
			<section class="display-section">
				<div class="container">
					<h2 class="sec-tit" id="weare">WE ARE</h2>
					<p class="desc">
						"휴먼 교육센터 디지털 컨버전스 과정입니다." <br> "그리고 지금은 화면설계 시간입니다."
					</p>
				</div>
			</section>
		</section>

		<section class="promotion-section">
			<div class="container">
				<ul class="promo-list">
					<li><a href="#"> <img src="/resources/images/Peng_03.jpg"
							alt="">
							<h3>HOME</h3>
							<p>휴먼 교육센터 디지털 컨버전스 과정입니다.</p>
					</a></li>
					<li><a href="#"> <img src="/resources/images/Peng_03.jpg"
							alt="">
							<h3>WE ARE</h3>
							<p>휴먼 교육센터 디지털 컨버전스 과정입니다.</p>
					</a></li>
					<li><a href="#"> <img src="/resources/images/Peng_03.jpg"
							alt="">
							<h3>WORK</h3>
							<p>휴먼 교육센터 디지털 컨버전스 과정입니다.</p>
					</a></li>
					<li><a href="#"> <img src="/resources/images/Peng_03.jpg"
							alt="">
							<h3>BLOG</h3>
							<p>휴먼 교육센터 디지털 컨버전스 과정입니다.</p>
					</a></li>
				</ul>
			</div>
		</section>
		<section class="work-section cfixed">
			<h2 class="sec-tit" id="work">WORK</h2>
			<ul class="work-list">
				<li><a href="#" onclick="return false" onclick="return false"
					onclick="return false">
						<div class="info">
							<h3>작업01</h3>
							<span>소스/작업01</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false" onclick="return false">
						<div class="info">
							<h3>작업02</h3>
							<span>소스/작업02</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업03</h3>
							<span>소스/작업03</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업04</h3>
							<span>소스/작업04</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업05</h3>
							<span>소스/작업05</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업06</h3>
							<span>소스/작업06</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업07</h3>
							<span>소스/작업07</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
				<li><a href="#" onclick="return false">
						<div class="info">
							<h3>작업08</h3>
							<span>소스/작업08</span>
						</div> <img src="/resources/images/Peng_03.jpg" alt="">
				</a></li>
			</ul>
		</section>
		<section class="blog-section">
			<div class="container">
				<h2 class="sec-tit" id="blog">BLOG</h2>
				<ul class="blog-list">
					<li><a href="#"><img src="/resources/images/Peng_03.jpg"
							alt=""></a> <time datetime="2016-10-30">OCT 30, 2016</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#"><img src="/resources/images/Peng_03.jpg"
							alt=""></a> <time datetime="2016-10-30">OCT 30, 2016</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#"><img src="/resources/images/Peng_03.jpg"
							alt=""></a> <time datetime="2016-10-30">OCT 30, 2016</time> <a
						href=""><h3>타임스페이스는 사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
				</ul>
			</div>
		</section>
		<section class="contact-section">
			<div class="container">
				<h2 class="sec-tit" id="contactus">CONTACT</h2>
				<div class="form-box">
					<form action="" method="">
						<fieldset class="cfixed">
							<legend class="blind">CONTACT US</legend>
							<div class="form">
								<label for="name" class="blind">name</label> <input type="text"
									id="name" placeholder="Name"> <label for="phone"
									class="blind">phone</label> <input type="tel" id="phone"
									placeholder="Phone"> <label for="email" class="blind">email</label>
								<input type="email" id="email" placeholder="Email Address">
							</div>
							<div class="textarea">
								<label for="message" class="blind">message</label>
								<textarea name="message" id="message" placeholder="Message"></textarea>
							</div>
						</fieldset>
						<div class="send-btn">
							<button type="button" class="" data-toggle="modal"
								data-target="#exampleModal">메세지 보내기</button>
						</div>
					</form>
				</div>
			</div>
		</section>
		<footer class="footer">
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3105.186710353736!2d-77.03857900988957!3d38.89684545803391!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89b7b7bcdecbb1df%3A0x715969d86d0b76bf!2z67Cx7JWF6rSA!5e0!3m2!1sko!2skr!4v1590481422946!5m2!1sko!2skr"
				width="600" height="450" frameborder="0" style="border: 0;"
				allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
			<p class="copyright">LOGO</p>
		</footer>
	</div>
	<a href="/sample/" class="s_point"><p class="go_top">TOP</p></a>

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<input class="form-control" type="text" id="message"
						placeholder="메세지 내용을 입력해주세요.">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-info">수정</button>
					<button type="button" class="btn btn-danger">삭제</button>
					<button type="button" class="btn" data-dismiss="modal">닫기</button>

				</div>
			</div>
		</div>
	</div>
</body>
</html>