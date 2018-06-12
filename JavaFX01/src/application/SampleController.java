package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SampleController {
	//이벤트 처리
	@FXML
	private Button myButton;
	
	@FXML
	private void initialize() {
		//Handle Button event.
		myButton.setOnAction((event)->{
			System.out.println("취소버튼 클릭");	//콘솔에 나올 출력문
			Platform.exit();						//닫기 명령문
		});
	}
}
