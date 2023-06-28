/*
 * IT20225988
 * Piyathissa E.G.R.M
 * Group 12
 */
package model;
import java.security.SecureRandom;

import commons.CommonUtil;
import commons.IDInvalidException;
import interfaces.utilInterface;


public class WeekDay {
	 private String Sname;
	    private String Saddress;
	    private String Sex;
	    private int bornYear;
	    private  String Specialization;
	    private String freeDay;
	    private int[] Marks = new int[5];

	    public WeekDay() {
	    	
	    }

	    public void addDetails(String Sname, String Saddress, String Sex, int bornYear, String Specialization, String freeDay) {
	        this.Sname = Sname;
	        this.Saddress = Saddress;
	        this.Sex = Sex;
	        this.bornYear = bornYear;
	        this.Specialization = Specialization;
	        this.freeDay = freeDay;
	    }
	    public void addMark(int Mark1,int Mark2,int Mark3,int Mark4,int Mark5){
	        Marks[1] = Mark1;
	        Marks[2] = Mark2;
	        Marks[3] = Mark3;
	        Marks[4] = Mark4;
	        Marks[5] = Mark5;
	    }

	    public String generateID(){
	        SecureRandom random = new SecureRandom();
	        int num = random.nextInt(100000);
	        return "IT"+String.format("%05d", num);
	    }


	    public WeekDay(String Sname, String Saddress, String Sex, int bornYear, String Specialization, String freeDay) {
	        this.Sname = Sname;
	        this.Saddress = Saddress;
	        this.Sex = Sex;
	        this.bornYear = bornYear;
	        this.Specialization = Specialization;
	        this.freeDay = freeDay;
	    }
	    public void showDetails(){
	        System.out.println("Student name "+ Sname+"\nStudent Address "+Saddress+
	                "\nGender "+Sex+"\nStudent Birth Year "+bornYear+"\nStudent Specialization "+Specialization
	                +"\nStudent FreeDay "+freeDay);

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

	    public void setSaddress(String Saddress) {
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

	    public String getfreeDay() {
	        return freeDay;
	    }

	    public void setfreeDay(String freeDay) {
	        this.freeDay = freeDay;
	    }

	    @Override
	    public String toString() {
	        return "Weekday{" +
	                "Sname='" + Sname + '\'' +
	                ", Saddress='" + Saddress + '\'' +
	                ", Sex=" + Sex +
	                ", bornYear=" + bornYear +
	                ", Specialization='" + Specialization + '\'' +
	                ", freeDay='" + freeDay + '\'' +
	                '}';
	    }
	
	
	
}
