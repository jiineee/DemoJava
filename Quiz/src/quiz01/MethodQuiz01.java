package quiz01;

public class MethodQuiz01 {
	public static void main(String[] args) {
		
		//1
		method1();
		
		//2
		String result2 = method2("안녕하세요");
		System.out.println(result2);
		
		//3
		double result3 = method3(1,2,3.0);
		System.out.println(result3);
		
		//4
		String result4 = method4(20);
		System.out.println(result4);
		
		//5
		method5(5,"가");
		
		//6
		int result6 = maxNum(2,3);
		System.out.println(result6);
		
		//7
		int result7 = abs(-8);
		System.out.println(result7);
		
		//8
		String result8 = java(5);
		System.out.print(result8);
		
		
	}//main끝
	
	//1
	static void method1() {
		System.out.println("안녕");
	}
	
	//2
	static String method2(String s) {
		return s;
	}
	
	//3
	static double method3(int a , int b , double c) {
		return a + b + c;
	}
	
	//4
	static String method4(int a) {
		String str="";
		if(a % 2 ==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
	}
	
	/*
	 *   if(a % 2 == 0){
	 *   	return "짝수";
	 *   }else{
	 *   	return "홀수";
	 *   }
	 */
	
	/*
	 *  return a % 2 == 0 ? "짝수" : "홀수";
	 */
	
	//5
	static void method5(int a , String s) {
		for(int i = 1; i <= a; i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	//6
	static int maxNum(int a , int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	
	//7 
	static int abs(int a) {
		if(a<0) {
			return -a;	
		}else {
			return a;
		}
		
		// static int abs(int a) {
		//return a > 0 ? a : -a;
		//}
	}

	//8
	static String java(int a) {	
		String str = "";
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				str += "자";
			}else {
				str += "바";
			}
		}	
		return str;
	}

}
