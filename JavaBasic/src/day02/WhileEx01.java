package day02;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int a = 1; //제어변수 : 반복문의 조건을 제어할 변수
		int sum = 0;//값을 누적할 변수는 바깥에서 선언
		
		
		while( a <= 10) { //제어변수로 조건을 생성
			
			sum += a; //sum = sum + a; 
			
			
			System.out.println(a);
			
			a++; //제어변수를 증가해서 언제가는 조건이 false  되도록 처리
		}
		
		System.out.println("1-10까지의 합:" + sum);
	}
}
