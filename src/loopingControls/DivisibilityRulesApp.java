package loopingControls;
import java.util.Scanner;
public class DivisibilityRulesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//taking user input
		System.out.println("Enter the number");//printing user input
		int n=scan.nextInt();//storing user input in n variable
        if(n>100)
        {
        	DivisibilityRules.Divisible2(n);
        	DivisibilityRules.Divisible3(n);
        	DivisibilityRules.Divisible5(n);
        	DivisibilityRules.Divisible2and5(n);
        	DivisibilityRules.Divisible3and5(n);
        	DivisibilityRules.PrimeNumber(n);
        	DivisibilityRules.EvenPrime(n);
        	DivisibilityRules.OddPrime(n);
        	DivisibilityRules.EvenDivisible3(n);
        	DivisibilityRules.OddDivisible5(n);
        	}
        else
        {
        	System.out.println("Enter the number greater than 100");
        }
	}


}
