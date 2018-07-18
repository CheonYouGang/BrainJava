<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("ID");
	String pw = request.getParameter("Password");
	String name = request.getParameter("Name");
	session.setAttribute("ID", id);
	session.setAttribute("Password", pw);
	session.setAttribute("Name", name);
%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->

<title>2018. 7. 18. 회원가입 약관</title>

<!-- 부트스트랩 -->
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="../bootstrap/js/bootstrap.min.js"></script>
	<h3 class="bs-docs-featurette-title">약관</h3>
	-----------------------------------------------------------------------<br/>
	1. 회원정보는 웹 사이트의 운영을위해서만 사용됩니다.<br/>
	2. 웹 사이트의정상운영을 방해하는 회원은 탈퇴처리합니다.<br/>
	-----------------------------------------------------------------------<br/>
	<form action=Subscribe.jsp method=post>
		위의 약관에 동의하십니까?
		<input type="radio" name="agree" value="yes">동의함
		<input type="radio" name="agree" value="no">동의하지 않음<br/><br>
		<button class="btn btn-lg btn-primary btn-block" type="submit">확인</button>
	</form>
</body>
</html>