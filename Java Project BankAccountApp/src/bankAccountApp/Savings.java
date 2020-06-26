package bankAccountApp;

public class Savings extends Account {
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor
	
	public Savings(String name, String ssn, double inintDeposit){
		super(name, ssn, inintDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()- .25;
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));	
	}
	
	//list the methods
	public void showInfo(){
		super.showInfo();
		System.out.println("Account Type: Savings");
		System.out.println("Your savings account features: "+
		"\nSafety Deposit Box ID: "+safetyDepositBoxID+
		"\nSafety Deposit Box ID: "+safetyDepositBoxKey);
		
	}

}
