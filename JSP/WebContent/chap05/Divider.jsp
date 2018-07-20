<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%
	String str1 = request.getParameter("NUM1");
	String str2 = request.getParameter("NUM2");
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	int result = num1 / num2;
%>
    
 <%--
 	int num1 = 0, num2 = 0, result = 0;
 
 	try{
 		
 		String str1 = request.getParameter("NUM1");
 		String str2 = request.getParameter("NUM2");
 		num1 = Integer.parseInt(str1);
 		num2 = Integer.parseInt(str2);
 		result = num1 + num2;
 		
 		//http://localhost:8080/JSP/chap05/Adder.jsp?NUM1=3&NUM2=2
 		
 	}catch(NumberFormatException e){
 		
 		/*해당 jsp페이지를 호출합니다.*/
		/*RequestDispatcher: 현재 request에 담긴 정보를 저장하고있다가
		그 다음 페이지 그 다음페이지에도 해당 정보를 볼 수있게
		계속 저장하는 기능*/
		
 		RequestDispatcher dispatcher = 
 				request.getRequestDispatcher("DataError.jsp");
 		dispatcher.forward(request, response);//->forward 구문 이용시 'DataError.jsp'화면만을 보여준다.
 	}
 
 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 19. 나눗셈 프로그램</title>
</head>
<body>
	<%= num1 %> / <%= num2 %> = <%= result %>
</body>
</html>