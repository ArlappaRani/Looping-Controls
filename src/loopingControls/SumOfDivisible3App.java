package loopingControls;
import java.util.Scanner;
public class SumOfDivisible3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		SumOfDivisible3 Sd=new SumOfDivisible3();
		Sd.Divisible(n);
		
		

	}

}
