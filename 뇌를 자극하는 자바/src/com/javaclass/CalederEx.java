package com.javaclass;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

//현재 날짜, 시간 출력

public class CalederEx {

	public static void main(String[] args) {
  //GregorianCalendar: 달력
  //래퍼런스(참조)변수 = 객체생성
		GregorianCalendar cal = new GregorianCalendar();
  //세계시간 조정  
//		TimeZone tz = TimeZone.getTimeZone("Europe/Madrid");
//		cal.setTimeZone(tz);
  //달력 1)		
/*		int year=cal.get(Calendar.YEAR);
		int month=cal.get(Calendar.MONTH)+1;
		int date=cal.get(Calendar.DATE);
		int amPm=cal.get(Calendar.AM_PM);
//		int hour=cal.get(Calendar.HOUR);		//(HOUR: 12시 표기시 0시로 표기)
		int hour=cal.get(Calendar.HOUR_OF_DAY); //(HOUR_OF_DAY: 오전은 0~11시 오후는 12~23시 표기)
		int min=cal.get(Calendar.MINUTE);
		int second=cal.get(Calendar.SECOND);
		
		String sAmPm = (amPm == Calendar.AM)?"오전":"오후";
		//*amPm == Calendar.AM 먼저 처리. 후에 Calendar.AM이 오전인가 오후인가 판단후 sAmPM대입
			System.out.printf(year+"년 "+month+"월 "+date+"일 "+
								sAmPm+" "+hour+"시 "+min+"분 "+second+"초");
			
			System.out.println("\n");*/
			
	//달력2) SimpleDateFormat 형태
//		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE aa hh시 mm분 ss초");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd EEEE aa hh:mm:ss");
		String date = df.format(cal.getTime());
		System.out.println(date);
	}

}
