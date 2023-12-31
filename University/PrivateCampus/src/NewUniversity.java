/*
  IT20225988
  Piyathissa E.G.R.M
  Group 12
 */

import model.Enroll;
import model.Specialization;
import model.WeekDay;
import model.Weekend;

public class NewUniversity {
	
	//Main method
	public static void main(String args[]) {
		Weekend student1= new Weekend();
		student1.addDetails("Jane","Malabe","F",1990,"DS","QA");
		String studentid=student1.generateID();
		student1.addMark(56, 34, 12, 46, 78);
		student1.showDetails();
		System.out.println("Student ID"+studentid);
		System.out.println();	
		
		WeekDay student2= new WeekDay();
		student2.addDetails("Jim", "Kaluthara", "M", 1991, "SE", "Tuesday");
		String studentid2=student2.generateID();
		student2.addMark(78,89,45,87,90);
		student2.showDetails();
		System.out.println("Student ID"+studentid2);
		
		Enroll  sem1 = new Enroll();
		sem1.enrollStudent(studentid,"IT");
		sem1.enrollStudent(studentid2,"SE");
		System.out.println("\n\nEnrolled Student Details");
		sem1.displayEnrolledStudents();
		
		Specialization spe= new Specialization();
		spe.addSpecialization("SE", 2.75);
		spe.addSpecialization("DS", 3.5);
		
		
	}

}
