package day11.inter.basic02;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog,cat,tiger};
		
		for(Animal ani : animals) {
			ani.eat(); //Animal의 기능
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat,goldfish를 저장하고,Ipet의 기능을 사용하는 반복문
		Ipet[] pets = new Ipet[3];
		
		pets[0] = (Ipet)dog;
		pets[1] = (Ipet)cat;
		pets[2] = new GoldFish(); //자동형변환
		
		for( Ipet p : pets) {
			p.play();
			
		}
		
		System.out.println("==============");
		
		PetHouse.carePet((Ipet)dog);
		PetHouse.carePet((Ipet)cat);
		PetHouse.carePet(pets[2]);
		
		
	}
}
