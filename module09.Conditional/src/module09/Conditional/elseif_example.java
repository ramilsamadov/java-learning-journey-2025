package module09.Conditional;

import java.util.Scanner;

public class elseif_example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String usarname = sc.nextLine();
		System.out.println("Type your first grade from exam ");
		int grade1 = sc.nextInt();
		System.out.println("Type your second grade from exam ");
		int grade2 = sc.nextInt();
		System.out.println("Type your third grade from exam ");
		int grade3 = sc.nextInt();
		
		double calc = grade1*0.3 + grade2*0.3 + grade3*0.4;
		System.out.println("Candidate name is "+usarname + " Grade="+calc);
		
		if(calc>80 && calc<=100) {
			System.out.println("Your mark is A");
		}
		else if(calc>60 && calc<=80) {
			System.out.println("Your mark is B");
		}
		else if(calc>50 && calc<=60) {
			System.out.println("Your mark is C");
		}
		else {
			System.out.println("You fail your grade is F");
		}
		
}}

