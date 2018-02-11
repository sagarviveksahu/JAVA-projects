package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradYear;
	private String courses;
	private String studentId;
	private int tutionBalance = 0;
	private static int costCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grad year: ");
		this.gradYear = in.nextInt();
		setStuId();
		//System.out.println("Name: " + firstName + " " + lastName + "\nYear: " + gradYear + "\nID: " + studentId);
		
	}
	
	public void setStuId() {
		id++;
		this.studentId = gradYear + "" + id;
	}
	
	public void enroll() {
		do {
			System.out.println("Enter course to enroll or Q to quit");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n" + course;
				tutionBalance = tutionBalance + costCourse;
			}
			else {
				System.out.println("Break!");
				break;
			}
		} while(1 != 0);
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tution Balance: " + tutionBalance);
	}
	
	public void viewBalance() {
		System.out.println("Your Balance is: $" + tutionBalance);
	}
	
	public void payTution() {
		System.out.println("Enter payment amount: ");
		Scanner pm = new Scanner(System.in);
		int payment = pm.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for payment of: " + payment);
		viewBalance();
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nYEAR: " + gradYear +
				"\nID: " + studentId +
				"\nCOURSES: " + courses +
				"\nBALANCE: " + tutionBalance;
		
	}

}


