/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.GUI
   addAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
	JComboBox genderCombo;
	ResultSet rs;

	

	public AddAction(JTable table, Jdbc_Manager jdbcManager, JTextField text1, JTextField text2, JTextField text3,
			JComboBox genderCombo) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.genderCombo = genderCombo;
	}

	public AddAction(JTable table, Jdbc_Manager jdbcManager, JTextField text1, JComboBox genderCombo, JTextField text3) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
		this.text1 = text1;
		this.genderCombo = genderCombo;
		this.text3 = text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String arr[] = new String[3];
		arr[0] = text1.getText();
		//arr[1] = text2.getText();text2 데이터 셋팅
		arr[1] = genderCombo.getSelectedItem().toString();//text2 -> genderCombo : 데이터 셋팅
		arr[2] = text3.getText();
		
		if(arr[1].equals("선택")) {
			JOptionPane.showMessageDialog(null, "성별을 선택해주십시오.", "성별 경고문.", JOptionPane.WARNING_MESSAGE);//메시지
			return;//종료
		}
		
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
		//text2.setText("");
		genderCombo.setSelectedIndex(0);//text2 -> genderCombo: 콤보박스 "선택"을 선택
		text3.setText("");
	}

}
