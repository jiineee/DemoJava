package quiz01;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		
		//1.7~100까지의 정수 중에 7의 배수만 가로로 출력
		//for(int i = 7; i <= 100; i +=7)
		for(int a = 7; a <= 100; a++) {
			
			if(a % 7 == 0) {
				System.out.print(a + " ");
					
			}
		
		}	
		System.out.println("");
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력
		int count = 0;
		for(int b = 1; b <= 200; b++) {
			
			if(b % 9 == 0) {
				count ++;	//1씩 증가 
			}	
		}
		System.out.println("1~200까지의 정수 중 9의 배수의 개수:" + count);
	
		//3. 100~50사이의 합
		
		int sum = 0;
		for(int c = 100; c >= 50 ; c-- ) {
			sum += c;
		}	
		System.out.println("100~50사이의 합:" + sum);
		
		//4. A~Z까지 가로로 붙여서 출력 A=65, Z=90
		
		String st = " ";
		for(char s = 'A'; s <= 'Z'; s++ ) {
			//System.out.print(s);
			st += s;		
		}
		System.out.println(st);
		
		//5. 입력받은 정수까지 팩토리얼 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int d = scan.nextInt();
		int fac = 1;
		for(int e = 1; e <= d; e++) {		
			fac *= e;
		}
		System.out.println(d + "!은" + fac);
	}
}
