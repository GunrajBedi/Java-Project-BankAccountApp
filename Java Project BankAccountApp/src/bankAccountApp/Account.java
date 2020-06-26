package bankAccountApp;

public abstract class Account implements InterestBaseRate{
	//list common properties for savings and chequing accounts
	private String name;
	private String ssn;
	private double balance;
	
	private static int index =10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set the base properties and initialize the account
	public Account(String name, String ssn, double inintDeposit){
		
		this.name=name;
		this.ssn=ssn;
		balance=inintDeposit +100;
		
		index++;
		this.accountNumber=setAccountNumber();	
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber(){
		String lastTwoOfSSN = ssn.substring(ssn.length()-2,ssn.length());
		int uniqueID = index;
		int randomNumber=(int)(Math.random()* Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID+ randomNumber;
	}
	
	public void compound(){
		double accuredInterest = balance * (rate/100);
		balance= balance +accuredInterest;
		System.out.println("Accrued Interest: $"+accuredInterest);
		printBalance();		
	}
	
	//list methods transactions
	public void deposit(double amount){
		balance = balance + amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount){
		balance= balance - amount;
		System.out.println("Withdrawing $"+amount);	
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance = balance - amount;
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalance();
	}
	
	public void printBalance(){
		System.out.println("your Balance is now: $"+balance);
	}
	
	//list common methods
	public void showInfo(){
		System.out.println("Name: "+name+
				"\nAccount Number: "+accountNumber+
				"\nSSN: "+ssn+
				"\nBalance: "+balance+
				"\nRate: "+rate+"%");
	}

}
