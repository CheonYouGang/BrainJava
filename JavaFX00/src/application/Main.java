package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {
			VBox root = new VBox(); 			// VBox 생성
			root.setPrefWidth(350); 			// VBox 너비 설정
			root.setPrefHeight(150); 			// VBox 높이 설정
			root.setAlignment(Pos.CENTER); 		// 컨트롤을 중앙으로 정렬
			root.setSpacing(20); 				// 컨트로 수직 간격

			Label label = new Label(); 			// 라벨 생성
			label.setText("Hello JavaFX");
			label.setFont(new Font(50)); 		// 폰트 속성 설정

			Button button = new Button();
			button.setText("확인");
			button.setOnAction(event -> Platform.exit()); // 확인버튼 누르면 종료함.(클릭 이벤트 처리)

			root.getChildren().add(label);
			root.getChildren().add(button);

			//씬
			Scene scene = new Scene(root);		// 가로 * 세로
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("첫 JavaFX!! 타이틀!");
			primaryStage.setScene(scene);
			primaryStage.show();				// 윈도우 보여주기
			//씬 끝

		} catch (Exception e) {
			e.printStackTrace();
		}
		// BorderPane root =
		// (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		// Scene scene = new Scene(root,400,400);//가로 * 세로
		// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		// primaryStage.setScene(scene);
		// primaryStage.show();//윈도우 보여주기

	}

	public static void main(String[] args) {
		launch(args);//
	}
}
