package day11.inter.basic;

public interface Inter1 {
	//public static final 자동으로 붙어서 상수취급
	int A = 10; 
	//메서드를 선언하면 자동으로 추상메서드가 됩니다.
	void method01();
	
	//인터페이스에서는 static,defult메서드 선언이 가능함
	public static void method03() {
		System.out.println("스태틱 메서드");
	}
	
	public default void method04() {
		System.out.println("디폴트 메서드");
	}
}
