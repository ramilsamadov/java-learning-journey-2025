package worker;

import java.util.Scanner;

public class WorkerProcess {
	public static void main(String[] args) {
		System.out.println("**********Welcome to WorkerApp**********");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no ");
		int no=sc.nextInt();sc.nextLine();
		
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		
		System.out.println("Enter the surname ");
		String surname = sc.nextLine();
		
		System.out.println("Enter the experience ");
		int experience = sc.nextInt();
		
		System.out.println("Enter the salary ");
		int salary = sc.nextInt();
		Worker worker = new Worker(no,name,surname,experience,salary);

		String operations = " 1-Worker's details\n 2-Increase salary\n 3-Format the computer";
		System.out.println(operations);
		System.out.println("Choose one operation: ");
		int key = sc.nextInt();
		switch(key){
			case 1:
				worker.showDetails();
				break;
			case 2:
				System.out.println("Enter the amount to increase salary: ");
				int inc_amount = sc.nextInt();
				worker.increase(inc_amount);
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter the name Who will format the computer: ");
				String byWho = sc.nextLine();
				System.out.println("Which OS will be set? ");
				String opsystem = sc.nextLine();
				worker.format(byWho, opsystem );
				break;
			default:
				System.out.println("Please type correct inputs");

	}
}}
