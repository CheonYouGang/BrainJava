<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. 주소록 해쉬맵</title>
</head>
<body>
<%
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("에드거", "보스턴");
	map.put("토마스", "오하이오");
	map.put("존", "워싱턴");
	
	request.setAttribute("Address", map);
	
	/*
	RequestDispatcher: 현재 request에 담긴 정보를 저장하고있다가
		그 다음 페이지 그 다음페이지에도 해당 정보를 볼 수있게 계속 저장하는 기능
	*/
	RequestDispatcher dispatcher =
			request.getRequestDispatcher("AddressView.jsp");
	dispatcher.forward(request, response);
%>
</body>
</html>