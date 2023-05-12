package day01;

public class Quiz12_1 {
	public static void main(String[] args) {
		
		//50~100까지의 합계
		int i = 50;
		int sum = 0;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
