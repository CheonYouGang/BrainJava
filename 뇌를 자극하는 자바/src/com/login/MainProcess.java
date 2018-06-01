/**
 * 2018. 6. 1. Dev By Cheon You Gang
   com.login
   MainProcess.java
 */
package com.login;

 /**
  * @author kosea112
  *
  */
public class MainProcess {
	
    LoginView loginView;
    TestFrm testFrm;
    
    
    public MainProcess() {
    	System.out.println("MainProcess.showFrameTest()");
	}

	// 테스트프레임창
    public void showFrameTest(){
    	System.out.println("MainProcess.showFrameTest()");
        loginView.dispose(); // 로그인창닫기
        this.testFrm = new TestFrm(); // 테스트프레임 오픈
    }
    
	public static void main(String[] args) {
		System.out.println("MainProcess.main()");
		// 메인클래스 실행
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // 로그인창 보이기
        main.loginView.setMain(main); // 로그인창에게 메인 클래스보내기
    }
   

	
}
