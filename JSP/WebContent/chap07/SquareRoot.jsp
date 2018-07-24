<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="m" uri="http://localhost:8080/JSP/chap07/math-function.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 24. SquareRoot(p366)</title>
</head>
<body>
	${param.Num}의 제곱근은? ${m:squareroot(param.Num)}<br/>
</body>
</html>