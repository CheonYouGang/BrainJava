<%@page import="java.io.FileWriter"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar"%>
<%! //메소드는 !안에넣어줘야 한다.(제거시 jspInit()에 에러남)
	private PrintWriter logFile;
	public void jspInit(){
		String filename = "D:\\wokspace\\data\\log3.txt";//틀려도 시행은 되는데 파일을 못씀.
		try{
			logFile = new PrintWriter(new FileWriter(filename, true));
		}catch(Exception e){
			System.out.printf("%TT - %s 파일을 열 수 없습니다. %n",
									new GregorianCalendar(), filename);
		}
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>2018. 7. 20. 현재 날짜와 시각</title>
</head>
<body>
<%
	GregorianCalendar now = new GregorianCalendar();
	String date = String.format("현재 날짜: %TY년 %Tm월 %Te일", now, now, now);
	String time = String.format("현재 시각: %TI시 %TM분 %TS초", now, now, now);
	out.println(date + "<BR>");
	out.println(time + "<BR>");
	if(logFile != null)
		logFile.printf("%TF %TT에 호출되었습니다. %n", now, now);//로그파일에 기록함
%>
</body>
</html>

<%!
	public void jspDestroy(){
	if(logFile != null)
		logFile.close();//로그파일을 닫습니다.
}
%>