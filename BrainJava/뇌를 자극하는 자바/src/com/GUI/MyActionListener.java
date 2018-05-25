/**
 * 2018. 5. 25. Dev By Cheon You Gang
   com.GUI
   MyActionListener.java
 */
package com.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
  * @author kosea112
  *
  */
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Button"))
			b.setText("버튼");
		else
			b.setText("Button");	
	}

}
