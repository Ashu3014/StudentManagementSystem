package StudentManagement;

public class StudentDatabaseApp {

	public static void main(String[] args)
	{
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition(500);
		System.out.println(stu1.toString());
		
		Student stu2 = new Student();
		stu2.enroll();
		stu2.payTuition(500);
		System.out.println(stu2.toString());
		
		Student stu3 = new Student();
		stu3.enroll();
		stu3.payTuition(500);
		System.out.println(stu3.toString());
		
		Student stu4 = new Student();
		stu4.enroll();
		stu4.payTuition(500);
		System.out.println(stu4.toString());
		
		// Ask how many new user we want to add
		
		//Create n number of new students
		

	}

}
