/**
 * 2018. 5. 25. Dev By Cheon You Gang
   com.GUI
   WindowEx4_0525.java
 */
package com.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
  * @author kosea112
  *
  */
public class WindowEx4_0525 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("명단 프로그램");
		frame.setPreferredSize(new Dimension(300, 200));
		
		Container containpane = frame.getContentPane();
		String colNames[] = {"이름", "성별", "나이"};
		Object data[][] ={ {"ABC", 'M', 15},
						  {"BCD", 'F', 23},
						  {"CDE", 'F', 11},
						  {"DEF", 'M', 56}};
		JTable table = new JTable(data, colNames);
		JScrollPane scrollPane = new JScrollPane(table);
		containpane.add(scrollPane, BorderLayout.CENTER);
		
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListener(table));//버튼에 addActionListener 기능 추가
		containpane.add(button, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
