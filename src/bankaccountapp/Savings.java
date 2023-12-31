package bankaccountapp;

public class Savings extends Account{
	// List properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setSafetyDepositBox();

	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		
	}
	// List any methods specific to Savings accounts
	public void showInfo() {
		System.out.println("Account type: Savings");
		super.showInfo();
		System.out.println( 
				" Your Saving Account Features" +
				"\n Safefty Deposit Box ID: " + safetyDepositBoxID +
				"\n Seafty Deposit Box Key: " + safetyDepositBoxKey 
				);
		
		
		
	}
}
