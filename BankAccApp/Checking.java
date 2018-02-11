package BankAccApp;

public class Checking extends Account {
	
	int debNum;
	int cardPin;
	
	public Checking(String name, String ssn, double initDep) {
		super(name,ssn,initDep );
		accNum = "2" + accNum;
		//System.out.println("New Checking Account");
		//System.out.println("Account Number: "+ this.accNum);
		//System.out.println("Name: " + name);
		debitCard();
	}
	
	@Override
	public void setRate() {
		rate = baseRate() * .15;
	}
	
	private void debitCard() {
		debNum = (int)(Math.random() * Math.pow(10, 12));
		System.out.println("Debit Card Number: " + debNum);
		cardPin = (int)(Math.random() * Math.pow(10, 4));
		System.out.println("Card Pin: " + cardPin);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Checking");
	}

}
