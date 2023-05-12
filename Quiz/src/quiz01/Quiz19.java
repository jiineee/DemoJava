package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		
		//금액의 동전 - 나머지와 몫
		//어떤 금액 x가 주어졌을때 , 큰 금액부터 거슬러서 몇개가 나와야하는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요>");
		int money = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "원:" + money/arr[i]);
			money %= arr[i]; //나머지 저장
		}
	}	
}

