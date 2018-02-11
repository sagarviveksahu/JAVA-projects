package BankAccApp;

public class BankAccApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checking acc1 = new Checking("Vivek Sahu","123456789",1500);
		Savings sav1 = new Savings("suraj did","098765432",1000);
		acc1.showInfo();
		sav1.showInfo();

	}
	


}
