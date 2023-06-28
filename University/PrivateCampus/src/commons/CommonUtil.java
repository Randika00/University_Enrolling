/*
 * IT20225988
 * Piyathissa E.G.R.M
 * Group 12
 * 
 */

package commons;

import java.util.Random;

import interfaces.utilInterface;

public class CommonUtil {
	//show details methods 
	
	@Override
	public void showDetails(String Sname,String Saddress,String Sex,String Specialization, int  Year, String Option, String Status) {
		
		if (Status.equals("Weekend")) {
			System.out.println("Student Sname " + Sname);
			System.out.println("Student Saddress " + Saddress);
			System.out.println("Gender " + Sex);
			System.out.println("Student   Year " + Year);
			System.out.println("Student Specilization " + Specialization);
			System.out.println("Student Job Title " + Option);	
		}else {
			System.out.println("Student Sname " + Sname);
			System.out.println("Student Saddress " + Saddress);
			System.out.println("Gender " + Sex);
			System.out.println("Student Year " + Year);
			System.out.println("Student Specilization " + Specialization);
			System.out.println("Student FreeDay " + Option);
		}
		
		
	}
	

}
