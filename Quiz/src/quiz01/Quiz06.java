package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다
		 * 
		 * 정수 3개를 입력을 받습니다.
		 * 
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력.(조건 - 같은수는 없다라고 가정)
		 * 
		 * 입력
		 * 15,30,7 -> max:30 mid:15 min:7
		 * 
		 * 힌트 a가 가장 클때의 조건 a> 
		 */
		
		//int max = 0;
		//int mid = 0;
		//int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자3개를 입력하세요>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a>b && b>c) {
			System.out.println("max는:" + a + "mid는:"+ b +"min는" +c);
			if(a>b && b<c) {
				System.out.println("max는:" + a + "mid는:"+ c +"min는" +a);
			}
		}		
		else if(a<b && b>c) {
			System.out.println("max는:" + b + "mid는:"+ a +"min는" +c);
		}		
		else if(a<b && b<c) {
			System.out.println("max는:" + c + "mid는:"+ b +"min는" +a);
		}		
		
		scan.close();
	}
}
