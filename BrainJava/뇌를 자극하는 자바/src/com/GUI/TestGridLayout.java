/**
 * 2018. 5. 24. Dev By Cheon You Gang
   com.GUI
   TestGridLayout.java
 */
package com.GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
  * @author kosea112
  *
  */
public class TestGridLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayout");
		frame.setPreferredSize(new Dimension(380, 650));
		
		Container contentPane = frame.getContentPane();
		
		GridLayout layout = new GridLayout(3, 2);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
