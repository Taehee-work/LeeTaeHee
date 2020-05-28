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
<link rel="shortcut icon" href="http://edu19.dothome.co.kr/images/favicon/favicon.ico">
<link rel="apple-touch-icon-precomposed"
	href="/images/favicon/home-touch-icon.png">
<link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<link rel="stylesheet" type="text/css" href="/resources/css/user.css">
<style>

</style>
<script src= "/resources/js/jquery.min.js"></script>
<script src= "/resources/js/common.js"></script>
<!-- 사용자 스크립트 -->
<!-- jQuery(function($){ //j쿼리 시작 : $(document).ready(function(){ }); == $(function(){ }); 과 동일 -->

<script>	
</script>
</head>
<body>
<!-- 더미 데이터:css작업전 내용 -->
	<div id="wrap">
		<header class="header cfixed">
			<h1 class="logo">
				<a href="">LOGO</a>
			</h1>
			<nav>
				<ul class="gnb">
					<li><a href="/">HOME</a></li>
					<li><a href="/weare">WE ARE</a></li>
					<li><a href="/work">WORK</a></li>
					<li><a href="/blog">BLOG</a></li>
					<li><a href="/contactus">CONTACT US</a></li>
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
					<h2 class="sec-tit">WE ARE</h2>
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
			<h2 class="sec-tit">WORK</h2>
			<ul class="work-list">
				<li><a href="#" onclick="return false" onclick="return false" onclick="return false">
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
				<h2 class="sec-tit">BLOG</h2>
				<ul class="blog-list">
					<li><a href="#"><img src="/resources/images/Peng_03.jpg" alt=""></a>
						<time datetime="2016-10-30">OCT 30, 2016</time> <a href=""><h3>타임스페이스는
								사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#"><img src="/resources/images/Peng_03.jpg" alt=""></a>
						<time datetime="2016-10-30">OCT 30, 2016</time> <a href=""><h3>타임스페이스는
								사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
					<li><a href="#"><img src="/resources/images/Peng_03.jpg" alt=""></a>
						<time datetime="2016-10-30">OCT 30, 2016</time> <a href=""><h3>타임스페이스는
								사용자 중심의 웹페이지를 제작하는 회사 입니다.</h3></a></li>
				</ul>
			</div>
		</section>
				<section class="contact-section">
			<div class="container">
				<h2 class="sec-tit">CONTACT</h2>
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
							<button>메세지 보내기</button>
						</div>
					</form>
				</div>
			</div>
		</section>
		<footer class="footer">
		<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3105.186710353736!2d-77.03857900988957!3d38.89684545803391!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89b7b7bcdecbb1df%3A0x715969d86d0b76bf!2z67Cx7JWF6rSA!5e0!3m2!1sko!2skr!4v1590481422946!5m2!1sko!2skr"
				width="600" height="450" frameborder="0" style="border: 0;"
				allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
			<p class="copyright">LOGO</p>
		</footer>
	</div>
</body>
</html>