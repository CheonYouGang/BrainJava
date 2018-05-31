/**
 * 2018. 5. 30. Dev By Cheon You Gang
   com.chap19GUI
   UpdateAction.java
 */
package com.chap19GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.kosea.kmove30.Jdbc_Manager;

/**
 * @author kosea112
 *
 */
public class MyMouseListener extends MouseAdapter {

	JTable table;
	JTextField text1, text2, text3;
	JComboBox genderCombo;

	public MyMouseListener(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		super();
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	/*콤보박스 생성자*/
	public MyMouseListener(JTable table, JTextField text1, JTextField text3, JComboBox genderCombo) {
		super();
		this.table = table;
		this.text1 = text1;
		this.text3 = text3;
		this.genderCombo = genderCombo;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		if (e.getButton() == 1) { // 우클릭시
			JTable table = (JTable) e.getSource();

			int row = table.getSelectedRow(); // 선택되어진 row구하기

			// 결과를 이클립스 컨설에만 알려줌(실제 프로그램 적용 x)
			if (row != -1) { // 셀이 선택되어진 상태인경우
				System.out.print(row + 1 + "행 ");
				// getValueAt(row(행), 1(column 열))
				System.out.println(table.getValueAt(row, 2));

				/* 해당 항목 클릭시 WindowEx8에 있는 JTextField 안에 들어감 */
				text1.setText(table.getValueAt(row, 0).toString());
				String genderStr = (table.getValueAt(row, 1).toString());
				text3.setText(table.getValueAt(row, 2).toString());

				/*콤보박스 속성 요소*/
				if (genderStr.equals("남")) {
					genderCombo.setSelectedIndex(1);
				} else if (genderStr.equals("여")) {
					genderCombo.setSelectedIndex(2);
				} else {
					genderCombo.setSelectedIndex(0);
				}
			}
		}
	}

}
