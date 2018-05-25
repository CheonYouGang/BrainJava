/**
 * 2018. 5. 24. Dev By Cheon You Gang
   com.GUI
   TestBoxLayout.java
 */
package com.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
  * @author kosea112
  *
  */
public class TestBoxLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BoxLayout");
		frame.setPreferredSize(new Dimension(550, 150));
		
		Container contentPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contentPane, BoxLayout.X_AXIS);
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("자바"));
		contentPane.add(new JButton("에스프레소"));
		contentPane.add(new JButton("아메리카노"));
		contentPane.add(new JButton("카푸치노"));
		contentPane.add(new JButton("블루마운틴"));
		contentPane.add(new JButton("브렌디"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}
