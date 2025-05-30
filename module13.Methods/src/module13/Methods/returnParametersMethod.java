package module13.Methods;

public class returnParametersMethod {
	public static void main(String[] args) {
		int multip = multiply(10,11);
		System.out.println(multip);
		String name = names("Ramil");
		System.out.println(name);
		char letters = letter('R');
		System.out.println(letters);
	}
	 public static int multiply(int num1,int num2) {
		 int result = num1*num2;
		 return result;
	 }
	 public static String names(String ad) {
		 return ad;
	 }
	 public static char letter(char a) {
		 return a;
	 }
}
