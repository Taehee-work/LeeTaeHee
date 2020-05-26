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
	<h1>HTML 이란?</h1>
	<h2>HTML의 역사</h2>
	<h3>팀 버너스리에 대해</h3>
	<h4>HTML의 태그</h4>
	<h5>HTMl의 태그</h5>
	<a href="/htmltest">페이지 다시 로딩 - 불러오기</a>
	<img src="/resources/images/Peng_03.jpg" alt="펭수이미지">
	<p>
		<Strong>이것은</Strong> 문단입니다.<br>
	</p>
	<p>이것은&nbsp;&nbsp;&nbsp;&nbsp; &amp; &lt; &gt; &copy; &nbsp;&nbsp;&nbsp;&nbsp;문단입니다.
	<hr>

	<ul>
		<li>리스트 01</li>
		<li>리스트 02</li>
	</ul>
	<ol>
		<li>리스트 01</li>
		<li>리스트 02</li>
	</ol>
	<div>
		<h2>회원가입폼 입니다.</h2>
		<form method="GET" action="/htmltest">
		성별을 선택해주세요
		<select name = "gender">
			<option value="M">남자</option>
			<option value="F">여자</option>
		</select>
		<br>
		<input type="text" name="user_id" placeholder="user password">
		<input type="file"><br> 
		본인소개글 작성:
		<textarea name="contents" cols="100" rows="5">여기에 글을 입력</textarea>
		<input type="submit" name="submit" value="회원가입" class="login">
		</form>
					
	</div>
	<br>
	<br>
	<br>
	<table summary="OO학교 OO반 성적표" style="border: 1px solid black">
		<!-- 인라인 스타일 주기 -->
		<caption>이 테이블은 학생들의 성적표 입니다.</caption>
		<tr>
			<th>이름</th>
			<th>성적</th>
		</tr>
		<tr>
			<td>이태희</td>
			<td>15</td>
		</tr>
		<tr>
			<td colspan="2">BBB</td>
		</tr>
		<tr>
			<td>CCC</td>
			<td>c</td>
		</tr>
	</table>
	
</body>
</html>