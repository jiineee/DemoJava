package quiz04;

public class GameMain {
	public static void main(String[] args) {
		
		Wizard wizard = new Wizard("최강마법사");
		wizard.info();
		
		wizard.iceArrow();
		wizard.iceArrow();
		
		
		
		Warrior warrior = new Warrior("전사최고");
		warrior.info();
		
		warrior.bash();
		warrior.bash();
		
	}
}
