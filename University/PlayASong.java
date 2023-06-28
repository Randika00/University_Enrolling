package assignment;
import java.util.Scanner;

public class PlayASong {

	public static void main(String[] args) {
		
		User Oper = new User("Simaon","simon@playasong.com");
		User art = new User("Pablo Albo","pablo@gmail.com");
		
		Artists art1 = new Artists(art,"pop",5);
		Operators op1 = new Operators(Oper,123,"accountant");
		
		art1.list();
		
		//art1.printDetails();
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("Enter number of downloads: ");
		int dow = ab.nextInt();
		System.out.println("");
		
		op1.printDetails();
		op1.calculate(dow, art1);
	}

}
