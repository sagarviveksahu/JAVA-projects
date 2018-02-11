package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private String email;
	private int defaultPasswordLength = 10;
	private String companySuffix = "abc.com";
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName );
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password: " + this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Email: " + email);
	}
	
	private String setDepartment() {
		System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}
		else if(depChoice == 2) {
			return "development";
		}
		else if(depChoice == 3) {
			return "accounts";
		}
		else {
			return "";
		}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String chPass) {
		this.password = chPass;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getChPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
	

}
