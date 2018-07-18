<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 18. 로그인 결과</title>
</head>
<body>
<%
	//session.setAttribute("Login_ID", id);값을 가져온다.
	String id = (String)session.getAttribute("Login_ID");
	if(id == null)
		out.println("로그인에 실패했습니다.");
	else
		out.println("안녕하세요, "+id+"님");
%>
</body>
</html>