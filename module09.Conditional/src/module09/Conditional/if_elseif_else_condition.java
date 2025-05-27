package module09.Conditional;
import java.util.Scanner;

public class if_elseif_else_condition {
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
		
		if(calc>=60) {
			System.out.println("You passed the exam");
		}
		else {
			System.out.println("You fail!");
	}
}}
