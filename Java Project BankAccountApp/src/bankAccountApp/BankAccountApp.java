package bankAccountApp;

public class BankAccountApp {
	public static void main(String[] args){
		
		Chequing chqacc1 = new Chequing("Tom Wilson","899899899",1500);
		Savings savacc1 = new Savings("Richard Love","499499499",2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("\n***************\n");
		chqacc1.showInfo();
		
	
		// read a csv file than create a new accounts
	}

}
