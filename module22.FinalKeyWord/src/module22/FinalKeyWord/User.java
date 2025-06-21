package module22.FinalKeyWord;

public class User extends BaseClass {
	private String username;
	private String password;
//	public final int a = 15; //or 
	// Final valuables must be upper because of readability
	public final int a;
	public User() {
		a = 15;
	}
	
	public void userDatas(final String username,final String password) { //sealed : mohurlu
		 System.out.println("Username: "+username);
		 System.out.println("Password: "+password);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
