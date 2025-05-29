package module12.Arrays;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println(" Prime number checker ");
		System.out.println("**********************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int num = sc.nextInt();
		sc.nextLine();
		int[] numbers = new int[num];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter the arrays's " + i + "th element ");
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < numbers.length; i++) {
			boolean isPrime = true;
			if (numbers[i] <= 1) {
				isPrime = false;
			} else {
				for (int j = 2; j < Math.sqrt(numbers[i]); j++) {
					if (numbers[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println("Array's " + i + "th element of " + numbers[i] + " is prime number ");
			} else {
				System.out.println("Array's " + i + "th element of " + numbers[i] + " is not prime number ");

			}
		}
	}

}
