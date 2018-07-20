<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 20. 서블릿 버전 정보</title>
</head>
<body>
	<!-- ServerInfoServlet에 있는
		String serverInfo = context.getServerInfo();
		int majerVersion = context.getMajorVersion();
		int minorVersion = context.getMinorVersion();
	-->

	웹 서버의 종류: <%= application.getServerInfo() %><br>
	지원하는서블릿 버전: <%= application.getMajorVersion() %>.
						 <%= application.getMinorVersion() %><br>
</body>
</html>