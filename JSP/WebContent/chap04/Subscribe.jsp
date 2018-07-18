<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar"%>
<%
	String agree = request.getParameter("agree");
	String result = null;
	if(agree.equals("yes")){
		String id = (String)session.getAttribute("ID");
		String pw = (String)session.getAttribute("Password");
		String name = (String)session.getAttribute("Name");
		PrintWriter writer = null;
		try{
			String filePath =
					application.getRealPath("/WEB-INF/"+id+".txt");//id, pw, 이름 정보 저장 경로
			writer = new PrintWriter(filePath);
			writer.println("아이디: " + id);
			writer.println("패스워드: " + pw);
			writer.println("이름: " + name);
			result = "Success";
		}catch(Exception e){
			result = "Fail";
		}finally{
			try{
				writer.close();
			}catch(Exception ie){
				
			}
		}
	}else{
		result = "Fail";
	}
	session.invalidate();//세션 종료
	response.sendRedirect("Result.jsp?RESULT=" + result);
	//Result.jsp파일에 get방식으로 넘김(실행 결과를 url뒤에 붙여 전송합니다.)
 %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->

<title>2018. 7. 18. 회원정보 저장</title>

<!-- 부트스트랩 -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="js/bootstrap.min.js"></script>
	
	
</body>
</html>