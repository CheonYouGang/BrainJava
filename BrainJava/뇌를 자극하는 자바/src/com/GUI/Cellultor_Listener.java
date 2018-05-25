/**
 * 2018. 5. 25. Dev By Cheon You Gang
   com.GUI
   Cellultor_Listener.java
 */
package com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
  * @author kosea112
  *
  */
public class Cellultor_Listener implements ActionListener {
	JTextField text1;
	JTextField text2;
	JTextField text3;

	public Cellultor_Listener(JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("확인")) {
			String textnum1 = text1.getText();
			String textnum2 = text2.getText();
			
			int num1 = Integer.parseInt(textnum1);
			int num2 = Integer.parseInt(textnum2);
			
			int total = num1 + num2;
			text3.setText(String.valueOf(total));
		}
		else {
			text1.setText("");	
			text2.setText("");
			text3.setText("");
		}
	}
}
