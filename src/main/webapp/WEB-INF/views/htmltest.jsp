<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	color: blue
}

h1 {
	background-color: skyblue
}

.test {
	font-size: 11px
}

#exam {
	text-align: center
}
</style>
</head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="/resources/js/user.js"></script>
</head>

<body>
	<h1>JavaScript 구현 예</h1>
	<p class="test">변경 전</p>
	<p id="exam">변경 전</p>
	<button type="button" onclick="myFunction()">변경</button>
	
</body>
</html>