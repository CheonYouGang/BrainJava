<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="m" uri="http://localhost:8080/JSP/chap07/math-function.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 24.</title>
</head>
<body>
	${param.Num1}부터 ${param.Num2}까지의 합은<br/><br/>
	답: ${m:total(param.Num1, param.Num2)}
</body>
</html>