<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%-- response.setStatus(200); --%><!-- http 상태코드 조정 -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 19. Adder 에러화면</title>
</head>
<body>
	<h1>잘못된 데이터를 입력하셨습니다.</h1>
	
	상세에러 메시지 : <%= exception.getMessage() %>
</body>
</html>