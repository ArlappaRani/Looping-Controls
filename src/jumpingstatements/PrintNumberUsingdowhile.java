package jumpingstatements;

public class PrintNumberUsingdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do 
		{
			if(i==7)//i==7 will break the iteration
			{
			 break;//loop will be stop
			} 
			 System.out.println(i);
			 i++;
			 
		 }
		while(i<=10);
         
	}

}
