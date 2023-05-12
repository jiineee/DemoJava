package quiz05;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	void add(int r) {
		result += r;
		System.out.println("누적" + result);
	}
	
	void sub(int r) {
		result -= r;
		System.out.println("차감" + result);
	}
	
	double circle(int r) {

		System.out.println("원1:" + pi);
		return pi * r *r;
	}
}
