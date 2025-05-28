package module11.Loops;

public class whileMix {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Numbers from 1 to 10 ");
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*****************");
		System.out.println("Even numbers ");
		i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("*****************");
		System.out.println("Odd numbers ");
		i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("*****************");
		System.out.println("Sum of even numbers ");
		i = 1;
		int total = 0;
		while (i <= 10) {
			if (i % 2 == 0) {
				total += i;
			}
			i++;
		}
		System.out.println(total);
		System.out.println("*****************");
		System.out.println("Sum of odd numbers ");
		i = 1;
		total = 0;
		while (i <= 10) {
			if (i % 2 == 1) {
				total += i;
			}
			i++;
		}
		System.out.println(total);

	}
}
