package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of students: ");
		Scanner sc = new Scanner(System.in);
		int numStu = sc.nextInt();
		Student[] students = new Student[numStu];
		for(int i=0;i<numStu;i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTution();
			System.out.println(students[i].showInfo());
		}
	}

}
