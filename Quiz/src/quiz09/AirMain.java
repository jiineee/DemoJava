package quiz09;

public class AirMain {
	public static void main(String[] args) {
		
		SuperSonicAp ssa = new SuperSonicAp("아시아나");
		
		ssa.takeOff();
		ssa.fly(1);
		ssa.land();
		System.out.println(ssa.info());
	}
}
