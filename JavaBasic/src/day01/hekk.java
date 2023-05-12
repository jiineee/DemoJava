package day01;

public class hekk {
	public static void main(String[] args) {
		//코드이동 : alt + 방향키 
		//코드복사: alt + ctrl + 방향키
		//되돌리기 ctrl + z
		//전체선택 : ctrl +a , ctrl + i
		//한줄 삭제 : ctrl + d
		System.out.println("출력문 자동완성");

		System.out.println(1); //1

		System.out.println("1"); //1

		System.out.println("안녕하세요");
		// 자바의 출력문의 종류 - 3가지 제공 
		// 개행문자 \n 가 없는 출력
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi\n");
		System.out.println("/n");

		//개행문자를 마지막에 포함해주는 println
		System.out.println("맨뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");

		//형식 지정 출력문 printf
		//내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/*
		 * %d - 정수를 대입할 수 있음
		 * %f- 실수를 대입할 수 있음
		 * %s - 문자열을 대입할 수 있음
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬
		*/
		System.out.printf("제 이름은 %s 입니다\n","coding404");
		System.out.printf("원주율은 %.2f 입니다\n",3.14);
		System.out.printf("오늘은 %d일 입니다\n",7);
		System.out.printf("제 생일\t은 %d년 %d월 %d일 입니다", 1999, 9, 17);
		
	}
}
