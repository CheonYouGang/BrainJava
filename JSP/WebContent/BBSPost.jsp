<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->

<title>게시판 글쓰기 - 결과화면2018. 7. 16.</title>

<!-- 부트스트랩 -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
	<script src="js/bootstrap.min.js"></script>
	
	
	<h2>글쓰기</h2>
	<%
		/*사용자가 입력한 데이터를 가져옵니다*/
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("Name");
		String title = request.getParameter("Title");
		String content = request.getParameter("Content");
		String result;													//새로고침 해도 한 번만 실행되게 한다.
		
		/*중복되지 않는 파일 이름을 만듭니다.*/
		
		//날짜 만들기
		SimpleDateFormat simpleDateFormat
			= new SimpleDateFormat("yyyy.MM.dd HH.mm.ss", Locale.KOREA);
		Date date = new Date();
		String time = simpleDateFormat.format(date);
		//날짜 만들기
		
		String filename = time + ".txt"; 								//.txt로 확장자
		
		PrintWriter writer = null;
		
		try{
			String filePath = 
				application.getRealPath("/WEB-INF/bbs/" + filename);	// filename 안붙여주면 데이터 쓸수 없음
			
			/*입력 데이터를 파일에 저장합니다.*/
			writer= new PrintWriter(filePath);
			writer.printf("제목: %s %n", title);
			writer.printf("글쓴이: %s %n", name);
			writer.println(content);
			result = "Success";
					
			out.println(filePath + " 위치에" + filename + " 으로 저장되었습니다.");
		}catch(Exception e){
			result = "Fail";
			out.println("파일에 데이터를 쓸 수 없습니다.");
		}finally{
			try{
				writer.close();
			}catch(Exception ie){
				
			}
		}
		response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);
		//BBSPostResult.jsp파일에 get방식으로 넘김(실행 결과를 url뒤에 붙여 전송합니다.)
	%>
	
</body>
</html>