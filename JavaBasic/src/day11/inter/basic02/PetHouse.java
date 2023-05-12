package day11.inter.basic02;

public class PetHouse {
	
	public static void carePet(Ipet pets) {
		if(pets instanceof Dog) {
			Dog dog = (Dog)pets;
			dog.play();
		}else if(pets instanceof Cat) {
			Cat cat = (Cat)pets;
			cat.play();
		}else if(pets instanceof GoldFish) {
			GoldFish fish = (GoldFish)pets;
			fish.play();
		}
	}
	
}
