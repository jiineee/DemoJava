package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {
	public static void main(String[] args) {
		//6
		char[] arr = {'a','b','c'};
		String result = method06(arr);
		System.out.println(result);
		
		//7
		int[] arr2 = {1,2,3,4,5};
		int result2 = method07(arr2);
		System.out.println(result2);
		
		//8
		String[] arr3 = method08("가","나");
		System.out.println(Arrays.toString(arr3));
	}//main 끝
	
	//6
	static String method06(char[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}	
		return str;
	}
	
	//7
	static int method07(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	
	//8
	static String[] method08(String a, String b) {
		//return new String[] {a,b};
		String[] arr = {a, b};
		return arr;
	}
	
	
	
	
}
