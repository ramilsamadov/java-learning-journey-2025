package module13.Methods;

import java.util.Scanner;

public class UserLogin_UdemyStyle {
	static String input_username = "ramilsamadov";
	static String input_password = "ramil1234";
	static boolean active = true;
	static int chance = 3;
	public static void main(String[] args) {


		if (active) {
			Scanner sc = new Scanner(System.in);
			while (active) {
				System.out.println("Type your username");
				String username = sc.nextLine();

				System.out.println("Type your password ");
				String password = sc.nextLine();

				boolean result = login(username, password);
				if (result) {
					System.out.println("You succesfully log in ");
					break;

				} else {
					System.out.println("Incorrect credentials. Remaining chance is "+chance);
					continue;
				}

			}
		} else {
			System.out.println("Your account is not active, Please get in touch with our assistant ");
		}
	}

	public static boolean login(String username, String password) {
		if (username.equals(input_username) && password.equals(input_password)) {
			return true;
		} else {
			chance--;
			if (chance == 0) {
				active = false;
			}
			return false;
		}
	}

}
