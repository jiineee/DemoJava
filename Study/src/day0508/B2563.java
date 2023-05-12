package day0508;



import java.util.Scanner;

public class B2563 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt(); //색종이의 수
		int[][] arr = new int [100][100]; //크기가 100인 
		int count = 0; //붙은 부분 카운트
		
		for(int i = 0; i < num; i++) { //색종이 개수까지 반복하는 반복문 
			int x = scan.nextInt(); //x좌표
			int y = scan.nextInt(); //y좌표
			for(int j = x; j < x+10; j++) { 
				for(int h = y; h < y+10; h++) {
					if(arr[j][h] == 1)  
						continue; //1인 경우 continue 가 실행되어 아래 문장 건너뛰어서 겹친부분 증가 노노
						arr[j][h] = 1; 
						++count; //카운트 증가 
					
				}
			}
		}
		System.out.println(count);
		
		scan.close();
	}
}
