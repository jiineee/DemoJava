package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 파일명을 입력을 받습니다.
		 * 
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨주면 됩니다.
		 */
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("파일명을 입력하세요>");
			String name = scan.next();
			
			String readPath = "C:\\Users\\user\\Desktop\\coures\\java\\file\\" + name +".png" ;
			String writePath = "C:\\Users\\user\\Desktop\\coures\\java\\filecopy\\" +name + "_copy.png";
			
			try(InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)	){
				
				byte[] arr = new byte[1024];
				int result;
				while((result = is.read(arr)) != -1) {
					out.write(arr,0,result);
				}
				System.out.println("파일 복사 완료");
				is.close();
				out.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}	
}
