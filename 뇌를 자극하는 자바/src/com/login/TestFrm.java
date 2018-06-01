/**
 * 2018. 6. 1. Dev By Cheon You Gang
   com.login
   TestFrm.java
 */
package com.login;

import javax.swing.JFrame;

import com.chap19GUI.WindowEx8_2;

/**
  * @author kosea112
  *
  */
public class TestFrm{
    public TestFrm() {
    	System.out.println("TestFrm.TestFrm()");
    	String[] args = {"GUI", "참가자 명단 프로그램"};
    	
    	new WindowEx8_2();
//        setSize(400, 400); JFrame
//        setVisible(true);
    }
}
