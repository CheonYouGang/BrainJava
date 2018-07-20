<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="InputDataError.jsp"%>
<%
	String str = request.getParameter("Num");
	if(str == null)
		throw new Exception("데이터 값이 입력되지 않았습니다.");//throw new는 값을 던져준다.
	double num = Double.parseDouble(str);						//현재는 Exception 클래스에 던져줬다.
	if(num<0)
		throw new Exception("음수 값은 넣으실 수 없습니다");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 19. 제곱근 익셉션</title>
</head>
<body>
	<%=num %>의 제곱근은? <%= Math.sqrt(num) %>
</body>
</html>