<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>1~200까지의합</title>
</head>
<body>
	<%
	int total = 0;
	int cnt = 1;
	for(cnt = 1; cnt <= 100; cnt++)
	total += cnt;
	
	%>
	
	1부터 <%= cnt-1%>까지의 합 = <%= total%><br>
	
	<%
	for(cnt = 101; cnt <= 200; cnt++)
	total += cnt;
	
	%>

	1부터 <%= cnt-1%>까지의 합 = <%= total%>
</body>
</html>