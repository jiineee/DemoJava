package day01;

public class Operator01 {
	public static void main(String[] args) {
		
		//부호 연산자 +,-
		int i = -3;
		int j = -i;
		
		//증감연산자 ++,--
		int k = 1;
		int h = ++k; //전위연산 - 먼저값을 증가시키고, 마지막에 대입 
		
		System.out.println("k는:" + k);
		System.out.println("h는:" + h);
		
		int x = 1;
		int y = x++; //후위연산 - 대입을 먼저하고, 자신을 증가
		System.out.println("x는:" + x);
		System.out.println("y는:" + y);
		
		//일반적 표현
		x = 1;
		x++;
		++x;
		
		x=1;
		System.out.println(++x);
		System.out.println(x++);
		
		//x=3
		
		//~연산자 -2진수를 반대로
		byte b = 10; //0000 1010
		System.out.println(~b); //1111 0101
		System.out.println(~b + 1);  //10의 보수 (-10)
		
		System.out.println("---------------------");
		
		//! 논리연산자 - 부정의 의미
		boolean bool = !true;
		System.out.println(bool);
		System.out.println(!bool);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
