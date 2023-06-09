package quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {
	public static void main(String[] args) {
		
	      /*
	       * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
	       * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
	       * 3. 분리한 토큰의 개수를 출력
	       * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
	       *    1. 안녕
	       *    2. 하세요.
	       *    3. 오늘은 
	       * 5. 분리된 문자열을 배열에 저장
	       */
		
		Scanner scan =new Scanner(System.in);
		
		System.out.print("문장을 입력하세요>");
		String str = scan.nextLine();
		
		StringTokenizer token = new StringTokenizer(str);
		String arr[] = new String[token.countTokens()];
		
		
		int cnt = token.countTokens();
		System.out.println("나눠진 문자열:" + cnt);
		
		
		for(int i = 1; token.hasMoreTokens();i++) {
			String a = token.nextToken();
			arr[i-1] = a ; 
			System.out.println(i + "." + a);
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
