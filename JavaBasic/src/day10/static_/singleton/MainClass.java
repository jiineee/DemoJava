package day10.static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		//Singleton s = new Singleton();
		
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s); //Singleton 객체
		System.out.println(s1); //Singleton 객체
		System.out.println(s2); //Singleton 객체 여러번 호출해도 똑같은 객체가 나옴
		
		System.out.println(s.getDomain());
		System.out.println(s1.getDomain());
		System.out.println(s2.getDomain()); 
	}
}
