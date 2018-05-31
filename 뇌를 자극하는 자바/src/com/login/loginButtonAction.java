/**
 * 2018. 5. 31. Dev By Cheon You Gang
   com.login
   loginButtonAction.java
 */
package com.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;

import com.kosea.kmove30.Jdbc_Manager;

/**
  * @author kosea112
  *
  */
public class loginButtonAction implements ActionListener {

	JTable table;
	Jdbc_Manager jdbcManager;
	
	public loginButtonAction(JTable table, Jdbc_Manager jdbcManager) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
