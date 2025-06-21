package loginEnum;

import loginEnum.LoginResult;

public class Main {
	public static void main(String[] args) {
		Username username = new Username();
		LoginResult check = username.checkUser("sss","ssss");
		if(check == LoginResult.Successfully) {
			System.out.println("You successfully sign in!");
		}
		else {
			System.out.println("Invalid username or password!");
		}
	}
}