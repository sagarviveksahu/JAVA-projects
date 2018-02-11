package BankAccApp;

public abstract class Account implements IntRate {
	
	String name;
	String ssn;
	double balance;
	double rate;
	static int index = 10000;
	String accNum;
	
	public Account(String name, String ssn, double initDep) {
		//System.out.print("New Account: ");
		this.ssn = ssn;
		this.balance = initDep;
		this.name = name;
		//System.out.println("Name: " + name + " SSN: " + ssn + " Balance: $" + initDep);
		index++;
		this.accNum = setAccNum();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccNum() {
		String lastTwoSsn = ssn.substring(ssn.length()-2, ssn.length());
		int unqId = index;
		int randNum = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoSsn + unqId + randNum;
	}
	
	public void showInfo() {
		System.out.println(
				"Name: " + name +
				"\nAccount Number: " + accNum + 
				"\nBalance: " + balance +
				"\nRate: " + rate + "%");
	}

}
