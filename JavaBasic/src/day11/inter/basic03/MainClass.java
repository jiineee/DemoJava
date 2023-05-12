package day11.inter.basic03;

public class MainClass {
	public static void main(String[] args) {
		
		Printed pt =new Samsung();
		
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
	}
}
