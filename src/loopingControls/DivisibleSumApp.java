package loopingControls;
import java.util.Scanner;
public class DivisibleSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		DivisibleSum Ds=new DivisibleSum();
		Ds.Sumof(num);

	}



}