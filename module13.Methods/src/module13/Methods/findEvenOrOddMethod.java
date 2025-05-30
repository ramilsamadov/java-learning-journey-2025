package module13.Methods;

import java.util.Scanner;

public class findEvenOrOddMethod {
	public static void main(String[] args) {
		System.out.println("Check the number Even or Odd ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of numbers ");
		int amount = sc.nextInt();
		sc.nextLine();
		int[] numbers = new int[amount];
		for(int i = 0;i<numbers.length;i++) {
			System.out.print("Array's "+i+"th is ");
			numbers[i] = sc.nextInt();
			sc.nextLine();
		}
		for (int number : numbers) {
			evenorodd(number);
		}
		
		
	}
	public static void evenorodd(int num) {
		if(num%2==0) {
			System.out.println("Number "+num+" is even");
		}
		else {
			System.out.println("Number "+num+" is odd");
		}
	}
}
