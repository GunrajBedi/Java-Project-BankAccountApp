package bankAccountApp;

public class Chequing extends Account {
	//List properties specific to chequing account
	private int debitCardNumber;
	private int debitCardPin;
	
	//constructor
	public Chequing(String name,String ssn, double inintDeposit){
		super(name, ssn, inintDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
		}
	@Override
	public void setRate(){
		rate = getBaseRate()* .15;
	}
	
	//list the methods
	private void setDebitCard(){
		debitCardNumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPin = (int)(Math.random()*Math.pow(10,4));	
		}
		
	public void showInfo(){
		super.showInfo();
		System.out.println("Account Type: Chequing");
		System.out.println("Your Chequing account features: "+
				"\nCard Number: "+debitCardNumber+
				"\nPIN: "+debitCardPin);
	}

}
