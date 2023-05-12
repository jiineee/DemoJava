package day04;

public class MethodEx07 {
	public static void main(String[] args) {
		
		//메서드의 연쇄호출  (동기적 방식)
		//test01();
		
		//메서드의 재귀
		recursive(1);
		
		System.out.println(fac(5));
		
	}//main end
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	static void test02() {
		System.out.println("2번 메서드 실행");
		
		System.out.println("2번 메서드 종료");
		
	}
	
	static void recursive(int a) {
		
		if(a == 10) {
			return; //함수의 종료
		}
		System.out.println(a + "호출");
		
		a++; 
		recursive(a);
	}

	static int fac(int a) {
		
		if(a==1) {
			return 1; //return 하면 0이 곱해짐
		}
		return a * fac(a-1);
	}


}


