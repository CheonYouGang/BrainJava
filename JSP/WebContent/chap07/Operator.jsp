<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. 연산자 연습</title>
</head>
<body>
	X = ${param.Num1}, Y = ${param.Num2}<BR><BR>
	X + Y = ${param.Num1 + param.Num2}<BR><BR>
	X - Y = ${param.Num1 - param.Num2}<BR><BR>
	X * Y = ${param.Num1 * param.Num2}<BR><BR>
	X / Y = ${param.Num1 / param.Num2}<BR><BR>
	X % Y = ${param.Num1 % param.Num2}<BR><BR>
	
	X가 더 큽니까? ${param.Num1 - param.Num2  > 0}<BR>
	Y가 더 큽니까? ${param.Num1 - param.Num2  < 0}<BR>
	X, Y가 모두 양수 입니까? ${(param.Num1) > 0 && (param.Num2 > 0)}<BR>
	X, Y가 모두 같습니까? ${param.Num1 == param.Num2?"예" : "아니오"}<BR>
	
	<!-- ex> http://localhost:8080/JSP/chap07/Operator.jsp?Num1=10&Num2=2 -->
</body>
</html>