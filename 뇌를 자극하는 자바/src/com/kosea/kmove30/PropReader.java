/**
 * 2018. 6. 4. Dev By Cheon You Gang
   com.kosea.kmove30
   PropReader.java
 */
package com.kosea.kmove30;

/**
 * @author kosea112
 *
 */
import java.io.FileInputStream;//프로퍼티 파일을 읽어옴
import java.util.Properties;

public class PropReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// 프로퍼티 파일 위치
			String propFile = "config.properties";

			// 프로퍼티 객체 생성
			Properties props = new Properties();

			// 프로퍼티 파일 스트림에 담기(파일 시스템으로부터 입력 바이트를 가져옴)
			FileInputStream fis = new FileInputStream(propFile);

			// 프로퍼티 파일 로딩
			props.load(new java.io.BufferedInputStream(fis));

			// 항목 읽기(텍스트 란은 value=Prop OK!의 value와 같아야함.)
			String value = props.getProperty("Key");

			// 콘솔 출력
			System.out.println(value);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// 출처: http://fruitdev.tistory.com/109 [과일가게 개발자]
