<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. 주소록 해쉬맵 뷰</title>
</head>
<body>
	${param.Name}의 주소는? ${Address[param.Name]}
	<!-- ex)
	http://localhost:8080/JSP/chap07/Address.jsp?Name=토마스
	 -->
</body>
</html>