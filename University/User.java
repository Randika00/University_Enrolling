package assignment;

public class User {
	protected String name;
	protected String email;
	public User(String name,String email) {
		this.name = name;
		this.email = email;		
	}
	public User(User newUser) {
		
		this.name = newUser.name;
		this.email = newUser.email;
	}
	public void printDetails() {}
}
