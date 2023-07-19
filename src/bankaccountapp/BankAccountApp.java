package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Willsion","321456987",1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "123654789",2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("***********");
		chkacc1.showInfo();
		
		
		
		
		// Read a CSV File then create a new accounts based on that data

	}

}
