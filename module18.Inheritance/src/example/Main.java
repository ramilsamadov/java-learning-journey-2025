package example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the App");
		System.out.println("Please choose one of the option ");
		String entrance = " 1-Truck\n 2-Motor Bike";
		System.out.println(entrance);
		int option = sc.nextInt();
		if (option == 1) {
			double penalty = 760;
			// int id, String carBrand, String color, double price, int wheels,double
			// punishmentAmount
			Truck truck = new Truck(1, "Honda", "Black", 50000, 6, penalty);
			System.out.println(" 1-Truck\'s details \n 2-Traffic punishments");
			int truckChoice = sc.nextInt();
			if (truckChoice == 1) {
				truck.carDetails();
			} else if (truckChoice == 2) {
				truck.punishments(penalty);
			} else {
				System.out.println("Invalid input!");
			}
		} else if (option == 2) {
			double penalty = 200;
			MotorBike motor = new MotorBike(2, "V3", "Red", 40000, 2, penalty);
			System.out.println(" 1-Motor Bike\'s details \n 2-Traffic punishments");

			int motorChoice = sc.nextInt();
			if (motorChoice == 1) {
				motor.carDetails();
			} else if (motorChoice == 2) {
				motor.punishments(penalty);
			} else {
				System.out.println("Invalid input!");
			}
		} else {
			System.out.println("Invalid input");
		}

	}
}
