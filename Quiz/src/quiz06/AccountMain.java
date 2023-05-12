package quiz06;

public class AccountMain {
	public static void main(String[] args) {
			
		Account acc = new Account("123-123","1234",10000);
		MyAccount ma = new MyAccount("123-123","1234",10000);

		acc.deposit(3000);
		
		ma.withDraw(5000);
		
		System.out.println(acc.getBalance());
	}
	
}
