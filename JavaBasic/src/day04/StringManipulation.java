package day04;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		
		//문자열다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		
		String str = "안녕하세요~ 영어로하면 하이!";
		//System.out.println(str[0]); //안됨!!
		
		//문자열을 다루는 다양한 메서드를 제공
		//문자열을 한글자 자르기
		char c = str.charAt(1);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf , lastIndexOf(뒤에서부터)
		int idx = str.indexOf("하");
		System.out.println("문자의 위치:" + idx);
		//만약 입력한 문자가 없다면 -1을 반환한다
		
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서 부터 찾은 위치:" + idx2);
		
		//문자열 변환 toUpperCase, toLowerCase
		String s = "abcDEF";
		
		String result = s.toLowerCase();
		System.out.println(result); //소문자로
		System.out.println(s); //★★★★원본 문자열은 그대로 유지★★★★💖❤
		
		String result2 = s.toUpperCase();
		System.out.println(result2); //대문자로
		
		System.out.println("=================================");
		//문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a => x로 변경, (전부다)
		System.out.println(s); //★★★★원본 문자열은 그대로 유지★★★★💖❤
		
		String result4 = s.replaceFirst( "a","x" );
		System.out.println(result4); // a -> x 로 변경(첫번째만)
		
		System.out.println("=================================");
		//공백제거 trim
		str = "    010-1111-2222   ";
		String result5 = str.trim(); //앞 뒤 공백제거해서 반환
		System.out.println(result5);
		
		str = " 안녕 하세요? 오늘은 4월 19일 입니다    ";
	//	System.out.println(str.trim()); //중간중간 공백이 없어지지는 않음
		str = str.replace(" ", ""); //원본 공백을 공백이 없게 
		System.out.println(str);
		
		System.out.println("=================================");
		//문자열 자르기 
		//특정 위치에서 자르기 substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9); // 인덱스 번째 미만 절삭
		System.out.println(result6);
		
		//str은 변함 없음
		
		String result7 = str.substring( 4,8 ); //앞에는 이상 뒤에는 미만 4<=x<8 인덱스 추출 
		System.out.println("ddd" + result7);
		
		System.out.println(str); //원본은 변함없음
		
		//짱짱짱 좋은 기능
		//split - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규표현식)
		String[] arr = str.split("-");
 		System.out.println(Arrays.toString(arr));
 		
 		String[] arr2 = str.split("");
 		System.out.println(Arrays.toString(arr2));
		
		//toCharArray - 한글자씩 char 형으로 자름
 		char[] arr3 = str.toCharArray();
 		System.out.println(Arrays.toString(arr3));
 		
		System.out.println("=================================");
		//문자열의 길이 
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이:" + len);
		
		//문자열의 비교 equlas()
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕 이 포함되어 있습니다");
		}
	}
}

















