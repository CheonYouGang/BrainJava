<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>피보나치</title>
</head>
<body>
	<%
		int i = 1;
		int j = 1;
		int k = 2;
	%>
	<%=i%>
	<%=j%>
	<%=k%>

	<%
		while (true) {
			k = i + j;
			i = j;
			j = k;

		if (k < 100) {
	%>
	<%=k%>
	<%
		} else {
				break;
			}
		}
	%>

</body>
</html>