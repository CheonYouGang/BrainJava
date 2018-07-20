package chap06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	
	private PrintWriter logFile;
	
	@Override
	public void init() throws ServletException {
		String fileName = getInitParameter("FILE_NAME");
		try {
			logFile = new PrintWriter(new FileWriter(fileName, true));
			//logFile = new PrintWriter(new FileWriter("D:\\wokspace\\data\\log.txt", true));
		} catch (Exception e) {
			throw new ServletException();//throw new는 값을 던져준다.
		}

	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("Name");
		String greeting = "안녕하세요, " + name + " 님.";
		/*********************파일로그 기록*********************/
		if(logFile != null) {
			GregorianCalendar now = new GregorianCalendar();
			logFile.printf("%TF %TT - %s %n", now, now, name);
		}
		/*********************파일로그 기록*********************/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>인사하기</TITLE></HEAD>");
		out.println("<BODY>");
		
		out.println(greeting);
		
		out.println("</BODY>");
		out.println("</HTML>");	
	}

	@Override
	public void destroy() {
		if(logFile != null)
			logFile.close();
	}

}
