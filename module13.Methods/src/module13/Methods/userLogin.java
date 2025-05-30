package module13.Methods;

import java.util.Scanner;

public class userLogin {

	public static void main(String[] args) {
		System.out.println("Welcome to BankApp");
		Scanner sc = new Scanner(System.in);
		String userName = "ramilsamadov";
		String password = "Ramil1234";
		boolean isTrue = false;
		int chance = 3;
		while(chance>0) {
			System.out.println("Type your username ");
			String userName_input = sc.nextLine();
			System.out.println("Type your password ");
			String password_input = sc.nextLine();
			if(userName_input.equals(userName) && password_input.equals(password)) {
				isTrue = true;
				break;
			}else {
                System.out.println("Incorrect username or password.");
				chance--;
			}
		}			
		if(isTrue) {
			System.out.println("You succesfully log in ");
		}
		else {
            System.out.println("Access denied. You have used all attempts.");
		}

	}

}
