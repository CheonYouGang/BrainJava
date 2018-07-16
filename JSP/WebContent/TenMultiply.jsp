<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>10까지 곱</title>
</head>
<body>
<!-- JSP에 의해 생성된 HTML입니다. -->
<%-- 데이터 처리하는 스크립툴(페이지 소스볼 시 서버에선 안보인다.) --%>
<%
	int result = 1;
	for(int cnt = 1; cnt <= 10; cnt++)
	result *= cnt;
%>

1*2*3*4*5*6*7*8*9*10= <%= result%>
</body>
</html>