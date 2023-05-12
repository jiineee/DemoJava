package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class 빠른입력 {
	public static void main(String[] args) {
		
		/*
		 * InputStreamReader은 
		 * 1바이트 데이터 => 2바이트 기반으로 변경 
		 */
		//입력은 스캐너 =>
		
		//Reader rd = new InputStreamReader(System.in);
		//BufferedReader bw = new BufferedReader(rd);
		
		try {
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.print(">");	
			String name = bw.readLine();
			
			System.out.println(name);
			
			bw.close();	
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
}
