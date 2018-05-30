/**
 * 2018. 5. 30. Dev By Cheon You Gang
   com.chap19GUI
   UpdateAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.kosea.kmove30.Jdbc_Manager;

/**
  * @author kosea112
  *
  */
public class UpdateAction implements ActionListener {
	
	Jdbc_Manager jdbcManager;
	JTextField text1, text3;//이름, 나이
	
	public UpdateAction(Jdbc_Manager jdbcManager, JTextField text1, JTextField text3) {
		super();
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			String name = text1.getText();
			String age  = text3.getText();
			
			jdbcManager.Update(name, age);
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

}
