package loopingControls;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		double a=scan.nextInt();
		 double q = a/2;
		 System.out.println(q);
		 double res=q/2;
		    System.out.println(res);
		
	    int count=0;
	    while(q>=1)//quotient is greater than one
	    {
	    q=res; 
	    res=q/2;//when quotient is less than 1 it will stop the iteration
	    System.out.println(res);
	    count++;
		}
	    
		
		
	
		

	}

}
