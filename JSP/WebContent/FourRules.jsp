<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->

<title>2018. 7. 16. 사칙 연산</title>

<!-- 부트스트랩 -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="js/bootstrap.min.js"></script>
	
	<%
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		/*사칙연산의결과를 request 내장 변수 안에저장합니다.*/
		request.setAttribute("Sum", new Integer(num1 + num2));
		request.setAttribute("Difference", new Integer(num1 - num2));
		request.setAttribute("Product", new Integer(num1 * num2));
		request.setAttribute("Quotient", new Integer(num1 / num2));
		
		/*해당 jsp페이지를 호출합니다.*/
		/*RequestDispatcher: 현재 request에 담긴 정보를 저장하고있다가
		그 다음 페이지 그 다음페이지에도 해당 정보를 볼 수있게
		계속 저장하는 기능*/
		RequestDispatcher dispatcher=
			request.getRequestDispatcher("FourRulesResult.jsp");
		
		//dispatcher.forward(응답, 호출);
		dispatcher.forward(request, response);
	%>
	
	
</body>
</html>