package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int max = -1000000;
		int min = 1000000;
		
		int[] arr = new int[N]; //크기가 N 인 배열 
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = scan.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}	
		}
		System.out.println(min + " " + max);
		
		scan.close();
	}
}
