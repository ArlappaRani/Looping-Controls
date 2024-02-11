package loopingControls;

public class DivisibleSum {
	public int Sumof(int n)
	{
		int i=1,sum=0,count=0;
		while(i<=n) 
		{
			if(i%3==0)
			{
			sum=sum+i;
			count++;
			}
		i++;
		}
			System.out.println("Sum of 3 divisible is:"+sum);
		    System.out.println("Count is:"+count);
		    
			
		
		
		return n;
	}
	

}
