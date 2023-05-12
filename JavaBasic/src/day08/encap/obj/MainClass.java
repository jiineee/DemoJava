package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		Chef c = new Chef();
		//사용하는 곳 (생성하는 곳)
		Hotel h = new Hotel(c);
		
		//chef를 생성해서 Hotel한테 전달
		//Chef chef = new Chef();
		//h.setChef(new Chef());
		
		Chef chef = h.getChef(); //반환유형
		
		System.out.println(c == chef); //true
		
		//Chef c1 = h.getChef(); //Hotel안에 있는 Chef를 꺼냄
		//c.cooking();

		
	}
}
