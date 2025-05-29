package module12.Arrays;

import java.util.Scanner;

public class valueScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Type the array's " + i + "th element ");
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
