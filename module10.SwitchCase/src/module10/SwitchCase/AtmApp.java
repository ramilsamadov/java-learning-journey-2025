package module10.SwitchCase;
import java.util.Scanner;
public class AtmApp {

	public static void main(String[] args) {
		System.out.println("Welcome to our Bank App");
		String data = " Check your account balance -->`1`\n "
				+ "Deposit money -->`2`\n "
				+ "Withdraw money -->`3`\n "
				+ "Transfer money -->`4`\n "
				+ "Exit -->`5`\n ";
		Scanner sc = new Scanner(System.in);
		
		double ramilBalance = 1200.65;
		String ramilIban = "PL12 3456 7891 0112 3456";
		String ramilUser = "ramil00";
		String ramilPassword = "r1234";
		
		double ilgarBalance = 1400.30;
		String ilgarIban = "PL98 7654 3210 9876 5432";
		String ilgarUser = "ilgar12";
		String ilgarPassword = "i1234";
		
		System.out.println("Type your usarname ");
		String username = sc.nextLine();
		System.out.println("Type your password ");
		String password = sc.nextLine();
		
		if(username.equals(ramilUser) && password.equals(ramilPassword)) {
			System.out.println("Welcome Ramil: "+ramilIban);
			System.out.println("Choose an Operation\n"+data );
			int option = sc.nextInt();
			switch(option) {
				case 1:
					System.out.println("Your balance is "+ramilBalance+"$");
					break;
				case 2:
					System.out.println("Enter the amount of money");
					int deposit = sc.nextInt();
					ramilBalance+=deposit;
					System.out.println("Your account balance is "+ramilBalance+"$");
					break;
				case 3:
					System.out.println("Enter the amount to withdraw ");
					int withdraw = sc.nextInt();
					if(ramilBalance<withdraw) {
						System.out.println("Insufficent funds");
						break;
					}
					else if(withdraw<0) {
						System.out.println("Invalid amount");
						break;
					}
					else {
						ramilBalance-=withdraw;
						System.out.println("Your account balance is "+ramilBalance+"$");
					}
					break;
				case 4:
					System.out.println("Enter the transfer amount ");
					int transfer = sc.nextInt();
					if(transfer>ramilBalance) {
						System.out.println("Insufficent funds ");
						break;
					}
					else if(transfer<0) {
						System.out.println("Invalid amount ");
						break;
					}else {
						ramilBalance-=transfer;
						ilgarBalance+=transfer;
						System.out.println("Your balance is "+ramilBalance+"$");
					}
					break;
				case 5:
					System.out.println("Thank you for using BankApp");
					break;
			}
			
		}else if(username.equals(ilgarUser) && password.equals(ilgarPassword)) {
		    System.out.println("Welcome Ilgar: " + ilgarIban);
		    System.out.println("Choose an Operation\n" + data);
		    int option = sc.nextInt();
		    switch(option) {
		        case 1:
		            System.out.println("Your balance is " + ilgarBalance + "$");
		            break;
		        case 2:
		            System.out.println("Enter the amount of money");
		            int deposit = sc.nextInt();
		            ilgarBalance += deposit;
		            System.out.println("Your account balance is " + ilgarBalance + "$");
		            break;
		        case 3:
		            System.out.println("Enter the amount to withdraw ");
		            int withdraw = sc.nextInt();
		            if(ilgarBalance < withdraw) {
		                System.out.println("Insufficient funds");
		                break;
		            } else if(withdraw < 0) {
		                System.out.println("Invalid amount");
		                break;
		            } else {
		                ilgarBalance -= withdraw;
		                System.out.println("Your account balance is " + ilgarBalance + "$");
		            }
		            break;
		        case 4:
		            System.out.println("Enter the transfer amount ");
		            int transfer = sc.nextInt();
		            if(transfer > ilgarBalance) {
		                System.out.println("Insufficient funds");
		                break;
		            } else if(transfer < 0) {
		                System.out.println("Invalid amount");
		                break;
		            } else {
		                ilgarBalance -= transfer;
		                ramilBalance += transfer;
		                System.out.println("Your balance is " + ilgarBalance + "$");
		            }
		            break;
		        case 5:
		            System.out.println("Thank you for using BankApp");
		            break;
		        default:
		            System.out.println("Invalid option selected");
		    }
		}

		else {
			System.out.print("Wrong username or password ");
		}
		sc.close();
	}

}
