package bankAccountApp;

public interface InterestBaseRate {
	//method that returns the base rate
	
	default double getBaseRate(){
		return 2.5;
	}
	
}
