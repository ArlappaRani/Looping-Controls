package loopingControls;

public class SumOfDivisible3 {
	public int Divisible(int num)
	{   
		int sum=0, count=0;/*sum will store the sum of divisible by 3 
		                   count will count the number of iteration which 
		                   number is divisible by 3  */ 
		for(int i=1;i<=num;i++)//it will the numbers from one to fifty
		{
			if(i%3==0)
			{
				sum=sum+i;//storing sum in variable
				count++;//increment the count value,it count only divisible 3 values 
			}
		}
		System.out.println("Sum of divisible by 3 is:"+sum);
		System.out.println("Count of divisible by 3 is:"+count);
			
			
		
		return num;
	}

}
