package assignment;

public class Operators extends User implements Calculations {
	private int empNum;
	private String jobTitle;
	public Operators(User newUser, int empNum, String jobTitle) {
		super(newUser);
		this.empNum = empNum;
		this.jobTitle = jobTitle;
	}
	
	public void printDetails() {
		System.out.println("Operator name is "+ name);
		System.out.println("Operator email is "+ email);
		System.out.println("Operator employess number is "+empNum);
		System.out.println("Operator designation is "+jobTitle);
	}
	float revenue;
	public void calculate(int num, Artists arti) {
		
		float tot=0;
		float avg=0;
		
		
		
		for(int i =0;i<5;i++)
		{
			try {
				tot+= Float.parseFloat(arti.List[i][1]);
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("You must enter a number to rate");
			}
		}
		
		avg=tot/5;
		
		revenue = avg * num;
		
		
		System.out.println("Artist: "+arti.name);
		System.out.println("Album revenue is LKR "+ revenue);
	}
	
	
}
