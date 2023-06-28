/*
 * IT20225988
 * Piathissa E.G.R.M
 * Group 12
 */
package model;

import java.util.HashMap;

public class Specialization {

private HashMap<String, Double> StudentSpecilzation;
	
	public Specialization() {
		this.StudentSpecilzation= new  HashMap<String, Double>();
	}
	
	public void addSpecialization(String Spec,double r) {
		this.StudentSpecilzation.put(Spec, r);
		
	}
}
