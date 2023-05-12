package day05;

public class Variable {
	//클래스 바로 아래는 선언만 할 수 있음,초기값 노노 a=10; 하고 싶으면 메서드 안으로 들어가야됨
	int a = 1; //멤버변수, 선언과 동시에 초기화는 가능함
	String b;
	
	void printNum(int d) { //매개변수도 지역변수임
		
		int c = 1; //지역변수
		
		System.out.println("멤버변수:" + a);
		System.out.println("멤버변수:" + b);
		System.out.println("지역변수:" + c);
		System.out.println("지역변수(매개변수):" + d);
	}
	
}
