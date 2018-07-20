<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String name = (request.getParameter("Name") == null) ?
			"" : request.getParameter("Name");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 20. Hello</title>
</head>
<body>
	안녕하세요, <%= name %>님<!-- html에 호출되는 내용 -->
	
	<% application.log(name +
			"[인사하기]JSP페이지가 호출되었습니다."); %><!-- 지정한 로그파일에 기록
														server common에서 output에 지정한
ㄴ														.txt에 저장됨 -->
</body>
</html>