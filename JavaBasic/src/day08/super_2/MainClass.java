package day08.super_2;

public class MainClass {
	public static void main(String[] args) {
		
		Student s = new Student("홍길동",20,"123123");
		System.out.println(s.info());
		
		System.out.println(s.equals(s)); //object상속받은 기능
	}
}
