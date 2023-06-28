/*
 * IT20225988
 * Piyathisaa E.G.R.M
 * Group 12
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Enroll {
	String id;
    String Specialization;
    HashMap<String, String> hashMap = new HashMap<String, String>();

    public void enrollStudent(String id, String Specialization) {
        hashMap.put(id, Specialization);
    }

    public Enroll(String id, String Specialization) {
        this.id = id;
        this.Specialization = Specialization;
    }

    void displayEnrolledStudents() {
    	for(Map.Entry<String,String> entry: enrollments.entrySet()) 
			System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    public Enroll() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    @Override
    public String toString() {
        return "Enroll{" +
                "id=" + id +
                ", Specialization='" + Specialization + '\'' +
                '}';
    }

}
