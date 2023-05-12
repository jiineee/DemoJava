package day10.static_.basic;

import java.util.Arrays;

public class MyArrays {
	
	
	/*
	 * Arrays클래스의 toString method 똑같이 만들기
	 * 
	 * 1.외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙입니다.
	 * 2.printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 return 되도록
	 *   method overloading  (String) (int) (char)
	 * 
	 */
	
	private MyArrays() {}
	
	public static String printArrays(String[] arr) {
		
		String str = "[";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if(i == arr.length -1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	public static String printArrays(int[] arr) {
		
		String str = "[";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if(i == arr.length -1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	public static String printArrays(char[] arr) {
		
		String str = "[";
		for(int i = 0; i <arr.length; i++) {
			
			str += arr[i];
			if(i == arr.length -1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	
//	public static String[] arr;
//	public static int[] arr2;
//	public static char[] arr3;
//	
//	public static String[] printArray(String[] a) {
//		
//		for(int i = 0; i < a.length(); i++) {
//			arr[i] += a;
//		}
//		System.out.println(Arrays.toString(arr));
//		return arr;
//	}
//	
//	public static int[] printArray(int[] b) {
//		
//		return b;
//	}
//	
//	public static char[] printArray(char[] c) {
//		
//		return c;
//	}


	
	
}
