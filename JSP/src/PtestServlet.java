import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PtestServlet extends HttpServlet{

//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");//한글데이터 인코딩
//		
//		String name = request.getParameter("Name");
//		String color = request.getParameter("color");
//		String animalbox = request.getParameter("Animalbox");
//		String food = request.getParameter("food");
//		
//		String afood = request.getParameter("afood");
//		String bfood = request.getParameter("bfood");
//		String cfood = request.getParameter("cfood");
//		
//		response.setContentType("text/html;charset=utf-8");
//		
//		PrintWriter out =response.getWriter();
//		out.println("<HTML>");
//		out.println("<HEAD><TITLE>성격테스트 - 결과화면</TITLE></HEAD>");
//		out.println("<BODY>");
//		out.printf("%s님의 성격 테스트 결과<br>", name);
//		out.printf("좋아하는 색깔은 %s <br>", color);
//		out.printf("좋아하는 동물은 %s이며<br>", animalbox);
//		out.printf("좋아하는 음식은 %s입니다<br>", Sfood(afood));
//		out.printf("좋아하는 음식은 %s입니다<br>", Sfood(bfood));
//		out.printf("좋아하는 음식은 %s입니다<br>", Sfood(cfood));
//		out.println("</BODY>");
//		out.println("</HTML>");
//		
//		private String sfoodmulti(String sfood) {
//			if (sfood==null) {//체크 안되있으면
//				return "받지않음";
//			}
//			else if(sfood.equals("on")){//체크 되어있으면
//				return "받음";
//			}
//			else {
//				return sfood;
//			}
//		}
//	}
}
