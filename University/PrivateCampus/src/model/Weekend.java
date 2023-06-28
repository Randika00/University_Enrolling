/*
 * IT20225988
 * Piyathissa E.G.R.M
 * Group 12
 */
package model;
import java.security.SecureRandom;


public class Weekend {
	 private String Sname;
	    private String Saddress;
	    private  String Sex;
	    private  int bornYear;
	    private String Specialization;
	    private String jobTitle;
	    private int[] Marks = new int[5];
	    
	    public Weekend() {
	    	
	    }
	    public void addDetails(String Sname, String Saddress, String Sex, int bornYear, String Specialization, String jobTitle ){
	    	this.Sname = Sname;
	        this.Saddress = Saddress;
	        this.Sex  = Sex;
	        this.bornYear = bornYear;
	        this.Specialization = Specialization;
	        this.jobTitle = jobTitle;	
	    }
	    //add marks
	    public void addMark(int Mark1, int Mark2, int Mark3, int Mark4, int Mark5) {
	    	Marks[1] = Marks[1];
	    	Marks[2] = Marks[2];
	    	Marks[3] = Marks[3];
	    	Marks[4] = Marks[4];
	    	Marks[5] = Marks[5];
	    	
	    }
	    public String generateID() {
	    	SecureRandom random = new SecureRandom();
	    	int num = random.nextInt(100000);
	    	return "IT"+String.format("%o5", num);
	    	
	    }
	    //add student details for weekend student
	    public Weekend(String Sname, String Saddress, String Sex, int bornYear, String Specialization, String jobTitle) {
	    	this.Sname = Sname;
	    	this.Saddress = Saddress;
	    	this.Sex = Sex;
	    	this.bornYear = bornYear;
	    	this.Specialization = Specialization;
	    	this.jobTitle = jobTitle;
	    	
	    }
	    public void showDetails() {
	    	System.out.print("Student Sname "+Sname+"\nStudent Saddress "+Saddress+"\nGender "+Sex+
	    			"\nStudent Birth Year "+bornYear+"\nStudent Specialization"+Specialization
	    			+"\nStudent Job Title "+jobTitle);
	    	
	    }
	    //Getter and Setter for the Weekend Student 
	    public String getSname() {
	    	return Sname;
	    	
	    }
	    
	    public void setSname(String Sname) {
	    	this.Sname = Sname;
	    	
	    }
	    public String getSaddress() {
	    	return Saddress;
	    }
	    public void setSaddress(String Saddrsss) {
	    	this.Saddress = Saddress;
	    	
	    }
	    public String getSex() {
	    	return Sex;
	    	
	    }
	    public void setSex(String Sex) {
	    	this.Sex = Sex;
	    	
	    }
	    public int getbornYear() {
	    	return bornYear;
	    	
	    }
	    public void setbornYear(int bornYear) {
	    	this.bornYear = bornYear;
	    	
	    }
	    public String getSpecialization() {
	    	return Specialization;
	    	
	    }
	    public void setSpecialization(String Specialization) {
	    	this.Specialization = Specialization;
	    	
	    }
	    public String getjobTitle() {
	    	return jobTitle;
	    	
	    }
	    public void setjobTitle(String jobTitle) {
	    	this.jobTitle = jobTitle;
	    	
	    }
	    @Override
	    public String toString() {
	    	return "Weekday{" +
	    ", Sname= '" + Sname + '\'' +
	    ", Saddress= '" + Saddress +'\'' +
	    ", Sex= '" + Sex +
	    ", bornYear='" + bornYear +
	    ", Specialization= '" + Specialization + '\''+
	    ", jobTitle='" + jobTitle + '\'' +
	    '}';
	    
	    }
	}

	

