/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.chap19GUI
   SelectAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.Jdbc_Manager;

/**
  * @author kosea112
  *
  */
public class SelectAction implements ActionListener {
	//속성
	JTable table;
	Jdbc_Manager jdbcManager;
	ResultSet rs;

	
	//생성자
	public SelectAction(JTable table, Jdbc_Manager jdbcManager) {
		super();
		this.jdbcManager=jdbcManager;
		this.table = table;
	}

	//메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		String query = "select PName, Gender, Age from persons";
		
		String arr[] = new String[3];
		
//		arr[0] = text1.getText();
//		arr[1] = text2.getText();
//		arr[2] = text3.getText();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		try {
			rs = jdbcManager.Select(query);
			
			model.setNumRows(0);//조회 초기화(중복추가 방지)
			while(rs.next()) {
				arr[0]=rs.getString("PName");
				arr[1]=(rs.getString("Gender").equals("M"))?"남":"여";//.equals("")-문자 비교, == 숫자 비교
				arr[2]=rs.getString("Age")+"세";
				System.out.println(arr[0] + arr[1] + arr[2]);
				model.addRow(arr);// 레코드 데이터 추가
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
//		System.out.println("");
//		Object value = table.getValueAt(0, 0);
//		System.out.println(value.toString());
	}
}
