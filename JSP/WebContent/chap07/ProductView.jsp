<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- fmt경우 formatNumber 커스텀 액션 사용가능하게 함
	 uri="http://java.sun.com/jsp/jstl/fmt"
 --%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23. 상품 정보(자바빈-프로퍼티) 뷰, fmt(단위 설정)</title>
</head>
<body>
	<h3>상품 정보</h3>
	상품명: ${Product.name}<br/><br/>
	<fmt:setLocale value="ko_kr"/>
	가격: <fmt:formatNumber value="${Product.value}" type="currency" groupingUsed="true"/>
</body>
</html>