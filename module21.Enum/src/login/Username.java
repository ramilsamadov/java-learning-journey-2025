package login;

public class Username {
	private String username = "ramilsamadov";
	private String password = "r1234";
	
	public int checkUser(String username,String password) {
		if(username.equals(this.username) && password.equals(this.password)) {
			return 1;
		}
		else {
			return 0;
		}
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
