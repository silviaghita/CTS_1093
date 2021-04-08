package ro.ase.csie.cts.g1093.dp.facade;

public class LogIn {
	String username;
	String password;
	
	
	public LogIn(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public void login() {
	
	}
	
	public UserProfile getUserProfile() {
		return new UserProfile();
	}
	
}
