package module11.Loops;

public class forMix {
	public static void main(String[] args) {
		System.out.println("Numbers from 1 to 10 ");
		for (int i = 1; i <= 10; i ++) {
			System.out.println(i);
		}
		System.out.println("*****************");
		System.out.println("Odd numbers ");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		int total = 0;
		System.out.println("*****************");
		System.out.println("Sum of even numbers ");
		for (int i = 2; i <= 10; i += 2) {
			total += i;
		}
		System.out.println(total);
		System.out.println("*****************");
		System.out.println("Sum of odd numbers ");
		for (int i = 1; i <= 10; i += 2) {
			total += i;
		}
		System.out.println(total);

	}
}
