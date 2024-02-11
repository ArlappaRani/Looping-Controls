package loopingControls;

public class DivisibilityRules {
//ACTIVITY 1:divisible by2
	public static int Divisible2(int n)
	{
		for(int i=1;i<=n;i++)//Numbers start from 1 to n
		{
			if(i%2==0)//check condition for divisible by 2
			{
				System.out.print("Divisible by 2:"+i+" ");//printing i values
			}
		}
		System.out.println();//cursor moves to next line
		return n;
	}
//ACTIVITY 2:divisible by3
	public static int Divisible3(int n)
		{
			for(int i=1;i<=n;i++)//Numbers start from 1 to n
			{
				if(i%3==0)//check condition for divisible by 2
				{
					System.out.print("Divisible by 3:"+i+" ");//printing i values
				}
			}
			System.out.println();//cursor moves to next line
			return n;
		}
//ACTIVITY 3:divisible by5
		public static int Divisible5(int n)
		{
			for(int i=1;i<=n;i++)//Numbers start from 1 to n
			{
				if(i%5==0)//check condition for divisible by 2
				{
					System.out.print("Divisible by 5:"+i+" ");//printing i values
				}
			}
			System.out.println();//cursor moves to next line
			return n;
		}	
//ACTIVITY 4:divisible by2 and 5
		public static int Divisible2and5(int n)
		{
			for(int i=1;i<=n;i++)//Numbers start from 1 to n
			{
				if(i%2==0 && i%5==0)//check condition for divisible by 2
				{
					System.out.print("Divisible by 2 and 5:"+i+" ");//printing i values
				}
			}
			System.out.println();//cursor moves to next line
			return n;
		}	
//ACTIVITY 5:divisible by3 and 5
		public static int Divisible3and5(int n)
		{
			for(int i=1;i<=n;i++)//Numbers start from 1 to n
			{
				if(i%2==0)//check condition for divisible by 2
				{
					System.out.print("Divisible by 3 and 5:"+i+" ");//printing i values
				}
			}
			System.out.println();//cursor moves to next line
			return n;
		}	
//ACTIVITY 6:finding the prime  numbers between 1 to n		
	    public static int PrimeNumber(int n)
	    {
	    	 int count =0;
	    	for(int i=1;i<=n;i++)//numbers form 1 to n
	    	{
	    		for(int j=2;j<=i;j++)//numbers from 2 to i checking divisible
	    		{
	    			if(i%j==0)
	    			{
	    				count++;
	    				
	    			}}
	    			if(count==1)
	    			{
	    			System.out.print("Prime numbers:"+i+" ");	
	    			}
	    			
	    		}
	    	System.out.println();//next line
	    	return n;	
	    	}
//ACTIVITY 7:finding the even prime numbers between 1 to n
	    public static int EvenPrime(int n)
	    {
	    	int count=0;
	    	for(int i=1;i<=n;i++)
	    	{
	    		for(int j=2;j<=n;j++)
	    		{
	    			if(i%j==0 && i%2==0)
	    			{
	    				count++;
	    			
	    			}}
	    		if(count==1)
	    		{
	    			System.out.print("Even prime Numbers:"+i+" ");
	    			
	    		}
	    		}
	    	System.out.println();
	    	return n;
	    	}
//ACTIVITY 8:finding the odd prime numbers between 1 to n
	    public static int OddPrime(int n)
	    {
	    	int count=0;
	    	for(int i=1;i<=n;i++)
	    	{
	    		for(int j=1;j<=n;j++)
	    		{
	    			if(i%j==0 && i%2!=0)
	    			{
	    				count++;
	    			
	    			}}
	    		if(count==1)
	    		{
	    			System.out.print("Odd Prime numbers:"+i+" ");
	    			
	    		}
	    		}
	    	System.out.println();
	    	return n;
	    }	
//ACTIVITY 9: even  numbers divisible by 3 
	public static int EvenDivisible3(int n)
	{
	     for(int i=1;i<=n;i++)
	     {
	    	 if(i%2==0 && i%3==0)
	    	 {
	    		 System.out.print("Even numbers which are divisible by 3:"+i + " ");
	    	 }
	     }
	     System.out.println();
	     return n;
	}
//ACTIVITY 10:odd numbers divisible by 5
	public static int OddDivisible5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0 && i%5==0)
			{
			   System.out.println("Odd numbers which are divisible by 5:" + i +" ");
			}
		}
		System.out.println();
	  return n;
	}
	    
	    }
	    
	    

