package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		KeyBoard keyBoard = new KeyBoard();
		Monitor monitor = new Monitor();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(keyBoard,monitor,mouse);
		
		
		com.computerInfo();
		
		Monitor m = com.getMonitor();
		m.info();
	}
}
