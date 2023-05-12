package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
	
		Radio r = new Radio();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		MyCart mc = new MyCart(2000);
		
	
		
		mc.buy(r);
		mc.buy(com);
		mc.buy(com);
		
	}
	

	
}
