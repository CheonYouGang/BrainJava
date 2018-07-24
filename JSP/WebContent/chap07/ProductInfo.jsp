<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="chap07.ProductInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 23.상품 정보(자바빈-프로퍼티)</title>
</head>
<body>
<%
	ProductInfo product = new ProductInfo();
	product.setName("초코케이크 3호");
	product.setValue(20000);
	request.setAttribute("Product", product);
	
	/*
	RequestDispatcher: 현재 request에 담긴 정보를 저장하고있다가
		그 다음 페이지 그 다음페이지에도 해당 정보를 볼 수있게 계속 저장하는 기능
	*/
	RequestDispatcher dispatcher =
			request.getRequestDispatcher("ProductView.jsp");
	dispatcher.forward(request, response);
%>
</body>
</html>