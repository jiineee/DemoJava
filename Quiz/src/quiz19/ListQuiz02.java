package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		while(true) {
			System.out.println("[1.등록 ㅣ 2.회원정보확인 ㅣ 3.회원정보검색 ㅣ 4.화원정보삭제 ㅣ 5.프로그램종료]");
			System.out.print("메뉴(번호)>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:
				//이름, 나이를 입력 받아서 user객체에 저장, 리스트에 순서대로 추가
					
					System.out.println("회원정보를 입력하세요");
					System.out.print("이름:");
					String name = scan.next();
					scan.nextLine();
					System.out.print("나이:");
					int age = scan.nextInt();
					
					User user = new User(name,age);
					list.add(user);
					System.out.println("정상입력되었습니다");
					
				
				break;
			case 2:
				//리스트에 담긴 모든 회원 이름, 나이를 출력
//				for(int i = 0; i <list.size(); i++) {
//					User u = list.get(i);
//					
//					System.out.println(u.getName()+ "/ " +u.getAge() );
//				}
				
				for(User u2 : list) {
					System.out.println(u2.getName()+ "/ " +u2.getAge() );
				}
				
				break;
			case 3:
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면, 이름과 나이를 출력
				//조건: 찾는 이름이 없다면 "***은 목록에 없습니다"를 출력합니다
				int count = 0;
				System.out.println("찾으시는 이름을 입력하세요");
				String se = scan.next();
				
				//boolean bool = true; 이런 방법도 있음
				for(int i = 0; i <list.size(); i++) {
					User u = list.get(i);
					String n = scan.next();
					
					if(se.equals(n)) {
						System.out.println(u.getName()+ "/ " + u.getAge() );
					//	bool = false;
						break;
					}else{
						count ++;
					}
				}
				//if(bool)
				if(count == list.size()) {
					System.out.println(se + "은 목록에 없습니다");
				}
				
				break;
			case 4:
				//삭제할 이름을 입력받아서 ,이름과 동일한 User객체를 첫번째 1개만 삭제
				System.out.println("삭제할 이름을 입력하세요");
				String de = scan.next();
				for(int i = 0; i< list.size(); i++) {
					User u = list.get(i);
					if(u.getName().equals(de)) {
						list.remove(i);
						break;
					}
				}
				for(int i = 0; i <list.size(); i++) {
					User u = list.get(i);
					
					System.out.println(u.getName()+ "/ " +u.getAge() );
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			default:
				break;
			}
			
		}
		

		
		
	}
}
