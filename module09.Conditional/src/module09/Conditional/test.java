package module09.Conditional;
import java.util.Scanner;
public class test {
	public static void main(String[] args) {
		//prices
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;
		double sales = 3.5*12 + 15.7*25 + 22*40;
		double extraBenefit = sales+(sales*50)/100;
		
		if(extraBenefit>1000) {
			System.out.println("You can oay the rent ");
		}else {
			System.out.println("Your money is not enough to pay the rent");
		}
		
	}
}
