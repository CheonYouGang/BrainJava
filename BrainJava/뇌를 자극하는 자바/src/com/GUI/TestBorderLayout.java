/**
 * 2018. 5. 24. Dev By Cheon You Gang
   com.GUI
   WindowEx3.java
 */
package com.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
  * @author kosea112
  *
  */
public class TestBorderLayout {


	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout");
		frame.setPreferredSize(new Dimension(380, 200));
		
//		ImageIcon image= new ImageIcon("images/java.jpg");
//		JLabel imageLabal = new JLabel(image);
		
		Container contentPane = frame.getContentPane();
		
		JTextField text = new JTextField("이름을 입력하세요");
		JButton button = new JButton("확인");
		JLabel label = new JLabel("hello", SwingConstants.CENTER);
		
		contentPane.add(text, BorderLayout.CENTER);
		contentPane.add(button, BorderLayout.EAST);
		contentPane.add(label, BorderLayout.SOUTH);
//		contentPane.add(imageLabal, BorderLayout.NORTH);
		contentPane.add(new JButton("취소"), BorderLayout.WEST);
		
//		ActionListener listener = new /*인터페이스를 구현할 클래스*/ ConfirmButtonActionListener(text, label);
//		button.addActionListener(listener);
		button.addActionListener(new ConfirmButtonActionListener(text, label));
		text.addActionListener(new ConfirmButtonActionListener(text, label));
		
		contentPane.setFocusable(true);
		
		text.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {  // 텍스트필드가 포커스를 얻을때 
		          text.setText("");                  // 이름을 입력하세요. 문자열 삭제
			}

		    public void focusLost(FocusEvent e) {
		    }
		 });
		
		text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("keyPressed");
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("VK_ENTER");
				}
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
