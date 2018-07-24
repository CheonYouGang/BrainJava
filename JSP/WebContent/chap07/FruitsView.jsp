<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. 어레이리스트(과일) 결과</title>
</head>
<body>
	<h3>이달에 가장 많이 팔린 과일입니다.</h3>
	<c:forEach items="${Fruits}" var="fruits" varStatus="status">
		${status.count}등 ${fruits}<br/>
	</c:forEach>
	
	<%--
	1등. ${Fruits[0]}<br>
	2등. ${Fruits[1]}<br>
	3등. ${Fruits[2]}<br>
	4등. ${Fruits[3]}<br>
	5등. ${Fruits[4]}<br>
	6등. ${Fruits[5]}<br>
	--%>
</body>
</html>