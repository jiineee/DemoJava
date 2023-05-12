package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account("123-456","1324",1000);
		
		acc.deposit(3000); // 입금
		
		acc.withDraw(5000); //출금
		
		
		//int num = scan.nextInt();
		int balance = acc.getBalance(); //잔고확인
		System.out.println(balance);
		
		
	}
	
}
