/**
 * 2018. 5. 28. Dev By Cheon You Gang
   com.GUI
   delAction.java
 */
package com.chap19GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.Jdbc_Manager;

/**
  * @author kosea112
  *
  */
public class DelAction implements ActionListener {
	JTable table;
	Jdbc_Manager jdbcManager;

	public DelAction(JTable table, Jdbc_Manager jdbcManager) {
		super();
		this.table = table;
		this.jdbcManager = jdbcManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();//최초로 선택된 행의 인덱스를 돌려주며, 행이 선택되어 있지 않은 경우는 -1 을 돌려줍니다.
		if(row==-1)
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		//삭제될 이름
		Object name = table.getValueAt(row, 0);
		String delName = name.toString();
		System.out.println(delName);
		/**/
		
		model.removeRow(row);//선택된 행 삭제
		
		
		//DB 테이블 레코드 삭제
		try {
			jdbcManager.Delete(delName);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());

		}
	}
}
