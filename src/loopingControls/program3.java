package loopingControls;
import java.util.Scanner;
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=scan.nextInt();
		int fact=1;
		int i=1;
		/*if user enter 5 the factorial will be calculated as 
		 1*2*3*4*5=120
		 */
		
		
		do
		{
			fact=fact*i;
			i++;
			System.out.println(fact);
		}
		while(i<=a);
	}
}


		

	


