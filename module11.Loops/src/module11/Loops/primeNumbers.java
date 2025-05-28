package module11.Loops;

public class primeNumbers {
	public static void main(String[] args) {

		for(int i=1;i<=20;i++) {
			boolean isPrime=true;
			if(i<=1) {
				isPrime = false;
			}
			else {
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
			}

			if(isPrime) {
				System.out.println(i + " is prime number");
			}
			else {
				System.out.println(i + " is not prime number");
			}
		}

	}
}
