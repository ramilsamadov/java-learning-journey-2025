
package login;

import login.Username;

public class Main {
	public static void main(String[] args) {
		Username username = new Username();
		int check = username.checkUser("sss","ssss");
		if(check == 1) {
			System.out.println("You successfully sign in!");
		}
		else {
			System.out.println("Invalid username or password!");
		}
	}
}
