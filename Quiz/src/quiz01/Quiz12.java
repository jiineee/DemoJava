package quiz01;

public class Quiz12 {
	public static void main(String[] args) {
		
		// 1000까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수
		
		
		int i = 1;
		int b = 0;
		
		while(i<=1000) {
			
			if(i % 4 == 0 && i % 8 != 0) {
				b ++;
			}
			
			i++;
		}
		
		System.out.println(b);
	}
}
