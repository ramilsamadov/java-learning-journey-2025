package loginEnum;

public class Username {
	private String username = "ramilsamadov";
	private String password = "r1234";
	
	public LoginResult checkUser(String username,String password) {
		if(username.equals(this.username) && password.equals(this.password)) {
			return LoginResult.Successfully;
		}
		else {
			return LoginResult.unSuccessfully;
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
