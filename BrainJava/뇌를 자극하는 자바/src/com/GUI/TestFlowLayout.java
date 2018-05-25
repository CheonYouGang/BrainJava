/**
 * 2018. 5. 24. Dev By Cheon You Gang
   com.GUI
   FlowLayout.java
 */
package com.GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
  * @author kosea112
  *
  */
public class TestFlowLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayout");
		frame.setPreferredSize(new Dimension(500, 150));
		
		Color color = new Color(30, 0, 30);
		frame.getContentPane().setBackground(color);
		
		Container contentPane = frame.getContentPane();
		FlowLayout layout = new FlowLayout();
		
		contentPane.setLayout(layout);
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("바나나"));
		contentPane.add(new JButton("딸기"));
		contentPane.add(new JButton("오렌지"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("포도"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
