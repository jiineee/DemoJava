package day11.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
	public static void main(String[] args) {
		
		
		/*
		 *   메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws입니다
		 *   throws구문이 붙어있는 생성자 or 메서드는 예외처리르 대신 진행해야 합니다.
		 *   
		 *   즉, 예외처리를 강요할 때 사용됩니다.
		 *   
		 */
		
		
		try {
			greeting(10);
			
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다");
			e.printStackTrace(); //에러가 발생했을때 에러로그를 확인하기 위해서 많이 사용합니다.
		}
		
		//throws 의 예시
		try {
			Class.forName("#$*#*#*");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//throw생성자 예시
		
		try {
			new FileInputStream("@##!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");
		
	} //main 끝
	private static String[] arr= {"hello" , "bye" , "say good bye"};
	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}
	
	
	
}
