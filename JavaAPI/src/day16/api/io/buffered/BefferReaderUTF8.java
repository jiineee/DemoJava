package day16.api.io.buffered;

import java.io.*;


public class BefferReaderUTF8 {	
	public static void main(String[] args) {
		/*
		 *  인코딩 = 파일or텍스트문서가 저장될때 => 컴퓨터가 아는 이진수 형태로 저장하는 형식
		 *  디코딩 = 컴퓨터가 아는 이진수 형태 => 인간이 알고있는 문자형식으로 변경
		 *  
		 *  인코딩 대표형식
		 *  문자인코딩 보통 UTF-8(유니코드) vs ECU-KR
		 *  파일인코딩 Base64(아스키코드)
		 *  
		 *  InputStreamReader = 1byte기반파일을 => 2byte기반으로 변경
		 *  파일을 읽을 때 인코딩 형식을 같이 지정할 수 있습니다.
		 *  
		 *  2가지방법
		 *  1. 원본파일의 인코딩을 UTF-8로 변경
		 *  2. 파일의 인코딩형식이 다르면(한글) 이 깨지게 되는데 인코딩을 동일한 형태로 맞춰서 가지고 오면 됩니다.
		 *  
		 *  
		 *  
		 */
		
		String path = "C:\\Users\\user\\Desktop\\coures\\java\\file\\example.txt";
		
		//InputStream fis = new FileInputStream(path); //1바이트 기반	
		//Reader rd = new InputStreamReader(fis , "UTF-8"); //1바이트기반 => 2바이트형식 변경
		//BufferedReader br = new BufferedReader(rd); //2바이트 기반 빠른 읽기
		
		
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path) , "EUC-KR"))) {
			
			String str;
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
