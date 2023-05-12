package quiz16;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * updown게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜던 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수 : x를 출력하고 종료 
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수있도록 코드를 변경 
		 */
		
		int num = (int)(Math.random() * 100) +1;
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;//시도횟수
		
		while(true) {
			
			try {
				System.out.print("정답입력>");
				int a = scan.nextInt();
				count ++; //시도 횟수 증가
				if(a < num) {
					System.out.println("더 큰 수를 입력하세요");
				}else if (a > num) {
					System.out.println("더 작은 수를 입력하세요");
				}else {
					System.out.println("정답");
					System.out.println("시도횟수:" + count);
					break;
				}
				
			} catch (Exception e) {
				System.out.println("에러발생");
				scan.nextLine();
				count ++;
			}
		}
		
		scan.close();
	}
}
