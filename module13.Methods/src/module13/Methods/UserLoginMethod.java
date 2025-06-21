package module13.Methods;

import java.util.Scanner;

public class UserLoginMethod {
    static String correctUsername = "ramilsamadov";
    static String correctPassword = "ramil1234";
	public static void main(String[] args) {
		int chance = 3;
		Scanner sc = new Scanner(System.in);
		while(chance > 0) {
			System.out.println("Type your username ");
			String username = sc.nextLine();
			System.out.println("Type your password ");
			String password = sc.nextLine();
			if(checkPasswordUsername(username,password)) {
				System.out.println("You succesfully sign in ");
				break;
			}
			else {
				System.out.println("Incorrect credentials. Remaining chance: " + (chance - 1));
			    chance--;			}
		}
		
		sc.close();
	}
	public static boolean checkPasswordUsername(String username_input,String password_input) {
		if(username_input.equals(correctUsername) && password_input.equals(correctPassword)) {			return true;
		}else {
			return false;
		}
}}
