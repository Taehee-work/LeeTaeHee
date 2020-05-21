<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<title>1.반응형 웹구조 준비하기</title>
<!-- css작업후 외부파일에 저장할 위치 -->
<link rel="stylesheet" type="text/css" href="/css/reset.css">
<!-- 참고: 파이콘(Favorite Icon)즐겨찾기 아이콘으로 등록 http://est0que.tistory.com/1539 -->
<link rel="shortcut icon" href="http://edu19.dothome.co.kr/images/favicon/favicon.ico">
<link rel="apple-touch-icon-precomposed"
	href="http://edu19.dothome.co.kr/images/favicon/home-touch-icon.png">
<!-- js작업후 외부파일에 저장할 위치 -->
<script src="/js/jquery.min.js"></script>
<style>
/* 모바일용 CSS */
/* 기본 CSS */
.container {
	width: 90%;
	max-width: 1132px;
	margin: 0 auto;
}

.cfixed:after, .container:after {
	display: block;
	content: "";
	clear: both;
}

.blind {
	position: absolute;
	width: 0;
	height: 0;
	line-height: 0;
	text-indent: -9999px;
	overflow: hidden;
}

.sec-tit {
	font-size: 42px;
	color: #3f51b5;
	font-weight: normal;
}

.divider {
	width: 90%;
	max-width: 1132px;
	margin: 0 auto;
	margin-top: 77px;
	background: #eee;
}

.m-divider {
	width: 20px;
	margin: 0 auto;
	margin-top: 77px;
	background: #3f51b5;
}

/* 태블릿용 CSS */
@media all and (min-width:768px) {
	/* 기본 CSS */
	.divider {
		margin-top: 124px;
	}
	.m-divider {
		margin-top: 124px;
	}
}

/* PC용 CSS */
@media all and (min-width:1132px) {
}
</style>
</head>
<body>
	<div id="wrap">
		<header class="header cfixed">
			<h1 class="logo">
				<a href="">LOGO</a>
			</h1>
			<nav>
				<ul class="gnb">
					<li><a href="">HOME</a></li>
					<li><a href="">WE ARE</a></li>
					<li><a href="">WORK</a></li>
					<li><a href="">BLOG</a></li>
					<li><a href="">CONTACT US</a></li>
				</ul>
			</nav>
			<span class="menu-toggle-btn"> <span></span> <span></span> <span></span>
			</span>
		</header>
		<article class="slider">
			<img src="http://edu19.dothome.co.kr/images/slide1.jpg" alt="">
		</article>
		<footer class="footer">
			<!-- 구글지도넣기 참조: http://skyfishbae.blogspot.kr/2015/11/4.html -->
			<iframe
				src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3193.1908531424174!2d127.18028131558675!3d36.83790497994078!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x357b293c64087a5b%3A0x1873dee0e6399a00!2z67Cx7ISd66y47ZmU64yA7ZWZ6rWQ!5e0!3m2!1sko!2skr!4v1513569521608"
				width="600" height="450" frameborder="0" style="border: 0"
				allowfullscreen></iframe>
			<p class="copyright">LOGO</p>
		</footer>
	</div>
</body>
</html>