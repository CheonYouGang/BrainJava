/**
 * 2018. 5. 24. Dev By Cheon You Gang
   com.GUI
   WindowEx2.java
 */
package com.GUI;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
  * @author kosea112
  *
  */
public class WindowEx2 {

	public static void main(String[] args) {
	JFrame frame = new JFrame("Hello Java");
	
	frame.setPreferredSize(new Dimension(300, 200));//frame변수의.사이즈 정수치 설정(창 넓이(가로, 세로))
	Container contentPane = frame.getContentPane();
	
	JLabel label = new JLabel("헬로 자바, おはようございます, Hello Java", SwingConstants.CENTER);
	//SwingConstants.CENTER : 라벨 텍스트를 중앙으로
	contentPane.add(label);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();//서브 컴포넌트의 추천 사이즈 및 레이아웃에 맞추어, 해당Window 사이즈를 변경합니다.
	frame.setVisible(true);//해당Window를 표시 또는 비표시로 합니다.
	frame.setLocationRelativeTo(null);//컴포넌트가 현재 표시되어 있지 않은 경우, 또는 null의 경우, 윈도우는 화면의 중앙에 배치됩니다.
	}

}
