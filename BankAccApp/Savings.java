package BankAccApp;

public class Savings extends Account {
	
	int safDepId;
	int safBoxKey;
	
	public Savings(String name, String ssn, double initDep) {
		super(name,ssn, initDep);
		accNum = "1" + accNum;
		//System.out.println("New Savings Account");
		//System.out.println("Account Number: "+ this.accNum);
		//System.out.println("Name: " + name);
		safDepBox();
	}
	
	@Override
	public void setRate() {
		rate = baseRate() - .25;
	}
	
	private void safDepBox() {
		safDepId = (int)(Math.random() * Math.pow(10, 3));
		System.out.println("Safety Deposite Id: " + safDepId);
		safBoxKey = (int)(Math.random() * Math.pow(10, 4));
		System.out.println("Safety Box Key: " + safBoxKey);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Savings");
	}


}
