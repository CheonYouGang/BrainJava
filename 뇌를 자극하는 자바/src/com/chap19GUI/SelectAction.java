/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.chap19GUI
   SelectAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
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
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		try {
			rs = jdbcManager.Select(query);
			
			model.setNumRows(0);
			ResultSetMetaData rmd = rs.getMetaData();
			int columnCount = rmd.getColumnCount();
			System.out.println("컬럼 갯수: " + columnCount);
			
			rs.last();//레코드set에 마지막 행으로 이동
			int rowCount =rs.getRow();//레코드 갯수
			rs.beforeFirst();//커서를 rs객체의 처음 행으로 이동합니다.
			System.out.println("레코드 갯수: "+rowCount);
			
			model.setNumRows(0);//조회 초기화(중복추가 방지)
			//조회된 결과가 1건이상 있다면
			if(rowCount>=1) {
				while(rs.next()) {
					arr[0]=rs.getString("PName");
					arr[1]=(rs.getString("Gender").equals("M"))?"남":"여";//.equals("")-문자 비교, == 숫자 비교
					arr[2]=rs.getString("Age");
					System.out.println(arr[0] + " " + arr[1] + " "+ arr[2] + " ");
					model.addRow(arr);// 레코드 데이터 추가
				}
			}
			//조회된 결과가 없을 때
			else {
				JOptionPane.showMessageDialog(null, "해당 레코드의 값이 없습니다.", "레코드 값이 없습니다.", JOptionPane.WARNING_MESSAGE);
				System.out.println("해당 레코드의 값이 없습니다.");
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
//		System.out.println("");
//		Object value = table.getValueAt(0, 0);
//		System.out.println(value.toString());
	}
}
