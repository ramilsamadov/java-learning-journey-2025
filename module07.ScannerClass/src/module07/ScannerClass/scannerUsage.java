package module07.ScannerClass;
import java.util.Scanner;

public class scannerUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reads an integer value from user input (e.g., 42)
        int scannerInt = sc.nextInt();

        // Reads a double (decimal number with more precision, e.g., 3.14159)
        double scannerDouble = sc.nextDouble();

        // Reads a float (decimal number, less precision than double, e.g., 2.5f)
        float scannerFloat = sc.nextFloat();

        // Reads a long integer (e.g., 1234567890123)
        long scannerLong = sc.nextLong();

        // Reads an entire line of text including spaces (e.g., "Hello World")
        // ⚠️ Be careful when using this after nextInt(), nextDouble(), etc.
        String scannerString = sc.nextLine();

        // Reads the next single word (input is read until the first space)
        String scannerNext = sc.next();

        // Reads a boolean value (must be either true or false)
        boolean scannerBoolean = sc.nextBoolean();

        // Always close the scanner to avoid resource leaks
        sc.close();
    }
}
