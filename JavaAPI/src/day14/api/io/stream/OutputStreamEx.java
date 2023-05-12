package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		//추상 클래스라 객체로 생성은 안되고 부모용도
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다
		 * 2. 생성자 매개값으로 파일을 쓸 경로가 들어갑니다.
		 * 3. io 패키지 거의 모든 클래스는 생성자에 throws가 있기 때문에
		 *    반드시 예외처리 문장안에서 사용합니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\file\\example.txt";
		
		//FileOutputStream = new FileOutputStream(path);
		
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			//1st
			//out.write(65); //한글자씩 씀
			//out.write(66);
			//out.write(67);
			
			//2nd
			//byte[] arr = {65,66,67,68,69}; //배열에 들어있는 데이터를 한번에 씀
 			//out.write(arr);
			
			//3nd
			String str = "한글";
			byte[] arr = str.getBytes(); //문자열을 바이트 배열로 변환
			
			out.write(arr);
			
			
			out.close(); //자원해제
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
