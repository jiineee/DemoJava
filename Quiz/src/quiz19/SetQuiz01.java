package quiz19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않은 6자리 수 (로또번호)
		 * 
		 * 1.Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2.Set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 * 
		 */
		
		TreeSet<Integer> set = new TreeSet<>();
		//Set<Integer> set = new Hashset<>();
		Random r = new Random();
		
		
		while(true) {
			if(set.size() == 6) {
				int num = r.nextInt(45) + 1;
				set.add(num);
				System.out.println(set.toString());
				break;
			}	
		}
		
		
		
			
			
		
			
			
		
		
		
	}
}
