package example;

import java.util.Random;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to App");
		System.out.print("Type your AZE code: ");
		String azeCode = sc.nextLine();
		Aze azeObj = new Aze();
		azeObj.setAze(azeCode);


	}
}
