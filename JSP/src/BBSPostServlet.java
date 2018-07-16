import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BBSPostServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			//super.doPost(req, resp);
		request.setCharacterEncoding("utf-8");//한글데이터 인코딩
		String name = request.getParameter("Name");
		String title = request.getParameter("Title");
		String content = request.getParameter("Content");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>게시판 글쓰기 - 결과화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("이름: %s <br>", name);
		out.printf("제목: %s <br>", title);
		out.println("---------------<br>");
		out.printf("<pre>%s</pre>", content);
		out.println("---------------<br>");
		out.println("저장되었습니다.");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
