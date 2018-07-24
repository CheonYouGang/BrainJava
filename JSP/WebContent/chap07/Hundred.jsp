<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. EL식 1~100까지 합.</title>
</head>
<body>
<%
	int sum = 0;

	for(int cnt = 1; cnt <= 100; cnt++)
		sum += cnt;
	
	request.setAttribute("Result", new Integer(sum));
	
	//RequestDispatcher: 현재 request에 담긴 정보를 저장하고있다가
	//그 다음 페이지 그 다음페이지에도 해당 정보를 볼 수있게 계속 저장하는 기능
	
	RequestDispatcher dispatcher =
			request.getRequestDispatcher("HundredResult.jsp");
	
	dispatcher.forward(request, response);
%>
</body>
</html>