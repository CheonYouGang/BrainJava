<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23.</title>
</head>
<body>
	입력문자열: ${param.Str1}, ${param.Str2}<BR/><BR/>
	두 문자열이 같습니까? ${param.Str1 == param.Str2}<BR/><BR/>
	어느 문자열이 먼저입니까? ${param.Str1 < param.Str2 ? $param.Str1 : param.Str2}
	<%--http://localhost:8080/JSP/chap07/StringOperators.jsp?Str1=dog&Str2=cat --%>
</body>
</html>