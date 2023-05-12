package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		
		/*
		 * 1.가로 세로길이를 입력받습니다
		 * 2.가로 세로 길이만큼 사각형을 출력합니다
		 * 3.단 윤곽만 나오면 됩니다
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		//행 
		for (int i = 1; i <= h; i++) {
			
			for(int j = 1; j <= w; j++) {
				
				if(i == 1 || i == h) { //첫행, 마지막행
					System.out.print("*");
				}else { //첫행, 마지막행이 아닌경우
					
					if(j == 1 || j == w){ //첫열 ㅇ마지막열
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
					
				}
				
				
				
			}		
			
			System.out.println();
			
			
				
		
		}
		
	}
		
}
		


