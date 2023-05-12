package quiz15;

public class MainClass {
	public static void main(String[] args) {
		IBag ib = new Wimb();
		
		ib.insert("거울");
		ib.insert("립밤");
		ib.insert("충전기");
		ib.insert("거울");
		ib.insert("프로틴");
		
		ib.print();
		ib.search("거울");
		ib.search("티1비");
		
		
		
		System.out.println(ib.delete("거울"));
		ib.print();
		
		
	}
}
