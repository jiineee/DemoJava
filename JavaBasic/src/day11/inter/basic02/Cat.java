package day11.inter.basic02;

public class Cat extends Animal implements Ipet {

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
		
	}

	@Override
	public void play() {
		System.out.println("고양이는 쥐랑 놀아요");
	}

}
