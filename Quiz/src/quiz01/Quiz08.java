package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		
		
		/*
		 *  1.랜덤수를 생성하고, 이 랜덤수를 이용하여 배열의 랜덤한 값이 출력되게 처리합니다
		 *  2.출력된 문자열이 어느나라 언어인지 판별해서 출력해주면 됩니다.
		 */
		String[] arr = {"안녕", "hello", "你好", "오하" , "#$#&"};
		
		int a = (int)(Math.random() * arr.length) ;
		
		//switch(arr[index])로 해도됨
		switch (a) {
		case 1:
			System.out.println("선택된 단어:" + arr[0]);
			System.out.println("한국어입니다");
			break;
		case 2:
			System.out.println("선택된 단어:" + arr[1]);
			System.out.println("영어입니다");
			break;
		case 3:
			System.out.println("선택된 단어:" + arr[2]);
			System.out.println("중국어입니다");
			break;
		case 4:
			System.out.println("선택된 단어:" + arr[3]);
			System.out.println("일본어입니다");
			break;
		case 5:
			System.out.println("선택된 단어:" + arr[4]);
			System.out.println("외계어입니다");
			break;
		default:
			System.out.println("아무것도 아님");
		break;
		}
		
	}
}
