package quiz05;

public class Computer extends Calculator {
	
	
	
	double circle(int r) {
		return Math.PI *r*r;
	}
	
	double rect(double w) {
		//System.out.println(");
		return w*w;
	}
	
	double rect(double w ,double d) {
		
		return w*d;
	}
	
	double rect(double w, double d,double h ) {
		
		return w*d*h;
	}
}
