package loopingControls;
import java.util.Scanner;
public class NegOddPosEvendowhileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		NegOddPosEvendowhile wh=new NegOddPosEvendowhile();
		wh.DisplayNumbers(n);
		

	}

}
