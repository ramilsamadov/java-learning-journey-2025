package module11.Loops;

public class doWhile {
	public static void main(String[] args) {
		System.out.println("Numbers from 1 to 10 ");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		System.out.println("***************");
		System.out.println("Even numbers ");
		i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;

		} while (i <= 10);
		System.out.println("***************");
		System.out.println("Odd numbers ");
		i = 1;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;

		} while (i <= 10);
		System.out.println("***************");
		System.out.println("Sum of even numbers ");
		i = 1;
		int total = 0;
		do {
			if (i % 2 == 0) {
				total += i;
			}

			i++;

		} while (i <= 10);
		System.out.println(total);
		System.out.println("***************");
		System.out.println("Sum of odd numbers ");
		i = 1;
		total = 0;
		do {
			if (i % 2 == 1) {
				total += i;
			}

			i++;

		} while (i <= 10);
		System.out.println(total);

	}
}
