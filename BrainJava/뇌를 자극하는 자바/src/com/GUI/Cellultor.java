/**
 * 2018. 5. 25. Dev By Cheon You Gang
   com.GUI
   Cellultor.java
 */
package com.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
  * @author kosea112
  *
  */
public class Cellultor{
	public static void main(String[] args) {
		JFrame frame = new JFrame("덧셈 프로그램");
		frame.setPreferredSize(new Dimension(300, 100));
		
		Container conpanel = frame.getContentPane();
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JTextField text1 = new JTextField(5);
		JLabel label1= new JLabel("+");
		JTextField text2 = new JTextField(5);
		JLabel label2= new JLabel("=");
		JTextField text3 = new JTextField(5);
		panel1.add(text1);
		panel1.add(label1);
		panel1.add(text2);
		panel1.add(label2);
		panel1.add(text3);
		
		JButton ok = new JButton("확인");
		JButton cencel = new JButton("취소");
		panel2.add(ok);
		panel2.add(cencel);
		ok.addActionListener(new Cellultor_Listener(text1, text2, text3));// Action 리스너 달기
		cencel.addActionListener(new Cellultor_Listener(text1, text2, text3));// Action 리스너 달기

		
		
		conpanel.add(panel1, BorderLayout.CENTER);
		conpanel.add(panel2, BorderLayout.SOUTH);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
