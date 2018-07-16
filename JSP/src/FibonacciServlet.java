import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FibonacciServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//한글데이터 인코딩
		
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>개인정보 입력 - 결과화면</TITLE></HEAD>");
		out.println("<BODY>");
		int i = 1;
		int j = 1;
		int k = 2;
		out.printf("%d %d ", i, j);
		
		while(true) {
			if(k<100) {
				out.printf("%d ", k);
				i = j;
				j = k;
				k = i+j;
			}
			else {
				break;
			}
		}
		
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
