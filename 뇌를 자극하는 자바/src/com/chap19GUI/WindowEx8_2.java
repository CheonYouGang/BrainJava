/**
 * 2018. 5. 31. Dev By Cheon You Gang
   com.chap19GUI
   WindowEx8_2.java
 */
package com.chap19GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.kosea.kmove30.Jdbc_Manager;

/**
 * @author kosea112
 *
 */
public class WindowEx8_2 {

	public static void main(String[] args) {
		// DB관리 클래스(연결, 조회, 추가, 수정, 삭제 클래스)
		Jdbc_Manager jdbcManager = new Jdbc_Manager();

		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(600, 400));

		Container contapane = frame.getContentPane();

		String colName[] = { "이름", "성별", "나이" };
		String genders[] = {"선택", "남", "여"};//성별 콤보박스 메뉴.
		DefaultTableModel model = new DefaultTableModel(colName, 0);
		JTable table = new JTable(model);

		contapane.add(new JScrollPane(table), BorderLayout.CENTER);

		JPanel panel = new JPanel();
		JTextField text1 = new JTextField(4);
		//JTextField text2 = new JTextField(2);
		JComboBox<String> genderCombo = new JComboBox<String>(genders);//콤보박스 
		JTextField text3 = new JTextField(2);
		JButton select = new JButton("조회");
		JButton add = new JButton("추가");
		JButton update = new JButton("수정");
		JButton del = new JButton("삭제");

		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("성별"));
		//panel.add(text2);
		panel.add(genderCombo);
		panel.add(new JLabel("나이"));
		panel.add(text3);
		panel.add(select);
		panel.add(add);
		panel.add(update);
		panel.add(del);

		contapane.add(panel, BorderLayout.SOUTH);

		// 조회, 추가, 수정, 삭제 이벤트 리스너 등록
		select.addActionListener(new SelectAction(table, jdbcManager));
		add.addActionListener(new AddAction(table, jdbcManager, text1, genderCombo, text3));
		table.addMouseListener(new MyMouseListener(table, text1, text3, genderCombo));// 마우스 리스너(이벤트)
		update.addActionListener(new UpdateAction(table, jdbcManager, text1, text3));
		del.addActionListener(new DelAction(table, jdbcManager));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

		System.out.println("프로그램 시작");

		try {
			jdbcManager.DBConnection("com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/mysql", "root", "12345");
			System.out.println("데이터베이스에 접속했습니다.");
			frame.setTitle("참가자 명단 프로그램-DB접속 성공");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
			frame.setTitle("참가자 명단 프로그램-DB접속 실패");
		} catch (Exception e) {
			e.getMessage();
			frame.setTitle("참가자 명단 프로그램-DB접속 실패");
		}
	}

}
