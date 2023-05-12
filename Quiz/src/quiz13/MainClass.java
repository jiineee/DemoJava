package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Circle c = new Circle("원" , 3);
		System.out.println(c.getName()  + "," + c.getArea());

		Rect r = new Rect("사각형" , 5);
		System.out.println(r.getName()+ "," + r.getArea());
		System.out.println();
		
	}
}
