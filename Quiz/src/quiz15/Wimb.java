package quiz15;

import java.util.Arrays;

public class Wimb implements IBag{

	private String[] arr = new String[100]; 
	private int index;
	
	@Override
	public void insert(String item) {
			arr[index] = item;
			index++;
	}

	@Override
	public void print() {
		//String str = "[";
		for(int i = 0; i <index; i++) {
			System.out.print(arr[i] + ",");
		}
		
	}

	@Override
	public int search(String item) {
		for(int i = 0; i < index; i++ ) {
			if(arr[i].equals(item)) {
				System.out.println(" ");
				System.out.println( item + "이 있습니다");
				System.out.println( item +"의 위치는:" + (i+1));
				return i;
			}else if(i == index - 1 && arr[i].equals(item) != true) {
				System.out.println("찾는 물건이 없습니다");
			}
		}
		return -1;//else안에 넣는게 아니라 반복문을 빠져나와서 
	}

	@Override
	public boolean delete(String item) {
		
		if(item == null) return false;
		
		for(int i= 0; i < this.index; i++) {
			//찾은 경우의 조건
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료
				for(int j = i; j < index-1; j++) {
					arr[j] = arr[j+1];
				}
				arr[index-1] = null;
				index--;
			
				return true;
			}
		}
		return false;
	}
	
}
