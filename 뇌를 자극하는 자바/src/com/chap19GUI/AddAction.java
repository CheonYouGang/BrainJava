/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.GUI
   addAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.Jdbc_Manager;

/**
 * @author kosea112
 *
 */
public class AddAction implements ActionListener {
	JTable table;
	Jdbc_Manager jdbcManager;
	JTextField text1, text2, text3;
	ResultSet rs;

	public AddAction(JTable table, Jdbc_Manager jdbcManager, JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String arr[] = new String[3];
		arr[0] = text1.getText();
		arr[1] = text2.getText();
		arr[2] = text3.getText();
		//DefaultTableModel - 2차원 배열로 표현한 GUI를 유동적으로 보여주기 위한 객체
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		boolean isCheck = false;// 입력창 체크 상태

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 0) 
				isCheck = true;
			else
				isCheck = false;
		}
		
		if(isCheck) {
			model.addRow(arr);// 레코드 데이터 추가
			try {
				jdbcManager.Insert(arr);//DBInsert 추가
			} catch (Exception e2) {
				e2.getMessage();
			}
		}
		// 입력창 빈칸 만들기
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}

}
