/**
 * 2018. 5. 25. Dev By Cheon You Gang
   com.GUI
   IndepClassListener.java
 */
package com.GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
  * @author kosea112
  *
  */
public class IndepClassListener extends JFrame{
	public IndepClassListener(){
		setTitle("버튼 기능");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JButton button = new JButton("Button");
		button.addActionListener(new MyActionListener());// Action 리스너 달기
		contentPane.add(button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		new IndepClassListener();
	}
}
