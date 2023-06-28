package university;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Weekend {
    private String Sname;
    private String Saddress;
    private  char Sex;
    private  int bornYear;
    private String Specialization;
    private String jobTitle;
    private int[] Marks = new int[5];
    
    public Weekend() {
    	
    }
    public void addDetails(String Sname, String Saddress, char Sex, int bornYear, String Specialization, String jobTitle ){
    	this.Sname = Sname;
        this.Saddress = Saddress;
        this.Sex  = Sex;
        this.bornYear = bornYear;
        this.Specialization = Specialization;
        this.jobTitle = jobTitle;	
    }
    public void addMark(int Mark1, int Mark2, int Mark3, int Mark4, int Mark5) {
    	Marks[1] = Marks[1];
    	Marks[2] = Marks[2];
    	Marks[3] = Marks[3];
    	Marks[4] = Marks[4];
    	Marks[5] = Marks[5];
    	
    }
    public String generateID() {
    	secureRandom random = new secureRandom();
    	int num = random.nextInt(100000);
    	return "IT"+String.format("%o5", null);
    	
    }
    public Weekend(String Sname, String Saddress, char Sex, int bornYear, String specialization, String jobTitle) {
    	this.Sname = Sname;
    	this.Saddress = Saddress;
    	this.Sex = Sex;
    	this.bornYear = bornYear;
    	this.Specialization = Specialization;
    	this.jobTitle = jobTitle;
    	
    }
    public void showDetails() {
    	System.out.print("Student name "+Sname+"\nStudent Address "+Saddress+"\nGender "+Sex+
    			"\nStudent Birth Year "+bornYear+"\nStudent Specialization"+Specialization
    			+"\nStudent Job Title "+jobTitle);
    	
    }
    
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
    public char getSex() {
    	return Sex;
    	
    }
    public void setSex(char Sex) {
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
