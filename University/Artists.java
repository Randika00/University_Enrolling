package assignment;
import java.util.Scanner;

public class Artists extends User{
	private String genre;
	private int numofSongs;
	String[][] List = new String[5][2];
	public Artists(User newUser, String genre, int numofSongs) {
		super(newUser);
		this.genre = genre;
		this.numofSongs = numofSongs;
		
	}
	public void printDetails() {
		System.out.println("Artist name is "+name);
		System.out.println("Artist email is "+email);
		System.out.println("Artist music genre is "+genre);
		System.out.println("Number of songs is "+numofSongs);
	}
	
	public String[][] list() {
		Scanner ac = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				if(j==0) {
					System.out.println("Enter song:");
					List[i][j] = ac.nextLine();
				}
				else {
					System.out.println("Enter rate:");
					List[i][j] = ac.nextLine();
				}
			}
			System.out.println("");
			
		}
		System.out.println("");
		printDetails();
		for(int a=0;a<5;a++) {
			for(int b=0;b<2;b++) {
				System.out.print(List[a][b]+"  ");
				b++;
				System.out.println(List[a][b]);
			}
		}
		
		return List;
	}
}
