<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("ID");
	String pw = request.getParameter("Password");
	if (loginCheck(id, pw))
		session.setAttribute("Login_ID", id);
	response.sendRedirect("LoginResult.jsp");
%>
<%!
private boolean loginCheck(String id, String pw) {
		if (id.equals("minerva") && pw.equals("1234"))
			return true;
		else if (id.equals("abc") && pw.equals("4567"))
			return true;
		else if (id.equals("def") && pw.equals("7890"))
			return true;
		else
			return false;
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 18. 로그인 체크</title>
</head>
<body>

</body>
</html>