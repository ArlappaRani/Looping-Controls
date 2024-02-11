package loopingControls;
import java.util.Scanner;
public class NegOddPosEvenUsingWhileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//taking the user input 
		int n=scan.nextInt();//storing in variable n
		NegOddPosEvenUsingWhile Nu=new NegOddPosEvenUsingWhile();//creating object
		Nu.print(n);//calling a non static method

	}

}
