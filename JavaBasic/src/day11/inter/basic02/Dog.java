package day11.inter.basic02;

public class Dog extends Animal implements Ipet{

	@Override
	public void eat() {
		System.out.println("갱얼쥐는 사료를 먹어요");
		
	}

	@Override
	public void play() {
		System.out.println("갱얼쥐는 나랑 놀아요");
	}

}
