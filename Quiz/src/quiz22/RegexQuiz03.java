package quiz22;

import java.io.*;
import java.util.*;



public class RegexQuiz03 {
	public static void main(String[] args) {
		
		/*
		 * 1.버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2.정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격 을 정규표현식으로 패턴분석
		 * Product객체에 저장하고 리스트에 저장
		 * 
		 * 3.외부라이브러리 (POI) - 자바에서 엑셀파일로 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 *   하나에 시트에 각 행데이터를 엑셀로 파일로 출력 
		 *   
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\file\\건담.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String s;
			while((s = br.readLine())!= null) {
				
				String pattern1 = "\\d+-//d+-\\d+";
				String pattern2 = "[가-힣]+";
				String pattern3 = "\\[[A-Z]+\\]";
				String pattern4 = "[가-힣]+";
				String pattern5 = "[0-9,]+원";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}