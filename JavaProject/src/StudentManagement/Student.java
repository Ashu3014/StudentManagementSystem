package StudentManagement;

import java.util.Scanner;

public class Student
{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String  studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 700;
	private static int id = 100;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student Class Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName  + "  " + lastName  +  "  " + gradeYear + " " + studentID);
		
		
	}
	//Generate an ID
	private void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;

	}
	
	// Enroll in Course
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
		System.out.println("BREAK!");
			break;
			}
		}while (1 !=0);
		
		System.out.println("ENROLLED IN : " + courses);
}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition(int i) {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return "Name: " + firstName  + " " + lastName +
				"\nGrade Level" + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
		}
	

}
