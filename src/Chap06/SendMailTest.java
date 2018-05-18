/**
 * 2018. 5. 17. Dev By Cheon You Gang
   Chap06
   SendMailTest.java
 */
package Chap06;

 /**
  * @author kosea112
  *
  */

import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


// 출처: http://fruitdev.tistory.com/15 [과일가게 개발자]

public class SendMailTest {

    public static void main(String[] args) {
        
        Properties p = System.getProperties();
        p.put("mail.smtp.starttls.enable", "true");     // gmail은 무조건 true 고정
        p.put("mail.smtp.host", "smtp.gmail.com");      // smtp 서버 주소
        p.put("mail.smtp.auth","true");                 // gmail은 무조건 true 고정
        p.put("mail.smtp.port", "587");                 // gmail 포트
           
        Authenticator auth = new MyAuthentication(); 
         
        //session 생성 및  MimeMessage생성
        Session session = Session.getDefaultInstance(p, auth);
        MimeMessage msg = new MimeMessage(session);
         
        try{
            //편지보낸시간
            msg.setSentDate(new Date());
             
            InternetAddress from = new InternetAddress() ;
             
             
            from = new InternetAddress("dbrkd0909@gmail.com");
             
            // 이메일 발신자
            msg.setFrom(from);
                     
            // 이메일 수신자
            InternetAddress to = new InternetAddress("rlatkdtn97@gmail.com");
            msg.setRecipient(Message.RecipientType.TO, to);
             
            // 이메일 제목
            msg.setSubject("(Gmail 테스트) 성공", "UTF-8");
             
            // 이메일 내용
            msg.setText("성공요~~(-_-)b", "UTF-8");
             
            // 이메일 헤더
            msg.setHeader("content-Type", "text/html");
             
            //메일보내기
            javax.mail.Transport.send(msg);             
        }catch (AddressException addr_e) {
            addr_e.printStackTrace();
        }catch (MessagingException msg_e) {
            msg_e.printStackTrace();
        }
        
        System.out.println("이메일 보냄");
    }
}

class MyAuthentication extends Authenticator {
    
    PasswordAuthentication pa;
    
 
    public MyAuthentication(){
         
        String id = "*********@gmail.com";       // 구글 ID
        String pw = "********";          // 구글 비밀번호
 
        // ID와 비밀번호를 입력한다.
        pa = new PasswordAuthentication(id, pw);
      
    }
 
    // 시스템에서 사용하는 인증정보
    public PasswordAuthentication getPasswordAuthentication() {
        return pa;
    }
}

/*후 작업
*1. gmail의 pop/imap에서 imap사용으로 설정
*2. 계정 환경설정 -> 계정 액세스 권한을 가진 앱 -> 보안 수준이 낮은 앱 허용: '사용 안함'을 '사용 함'으로 설정 
*/