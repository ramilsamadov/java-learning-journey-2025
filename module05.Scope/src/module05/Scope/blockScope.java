package module05.Scope;

public class blockScope {
	 public static void main(String[] args) {
	        if (true) {
	            int y = 20; // block scope
	            System.out.println("Inside block: " + y);
	        }
	        // System.out.println(y); // ❌ Error: y is not accessible here
	    }
}
