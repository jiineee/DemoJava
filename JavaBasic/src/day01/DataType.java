package day01;

public class DataType {
	public static void main(String[] args) {
		
		//정수형타입
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 12312313213123L; //L 이거 롱타입이야
		
		//2진수 , 8진수, 16진수
		int bin = 010; //8진수는 0을 붙임 
		System.out.println("8진수 010은:" + bin + "입니다");
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은:" + bin2);
		
		int hexa = 0xA9;//16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9는:" + hexa);
		
		System.out.println("-----------------");
		
		//실수형 타입
		float f1 = 3.14F; //F 이거 플롯이야
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		//자리수 정도는 기억 해야함 
		
		float f2 = 3.1415926545914F;
		double d2 = 3.1415926545914;
		
		System.out.println(f2); //7자리까지 유효함
		System.out.println(d2); //15자리까지 유효함
		
		System.out.println("------------");
		
		//true,false 만 저장가능함
		boolean boo11 = true;
		boolean boo12 = false;
		
		System.out.println(boo11);
		System.out.println(boo12);
		
		
		
		
		
		
		
		
		
		
		
	}
}
