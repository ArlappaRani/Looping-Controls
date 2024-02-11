package loopingControls;

public class divisiblesumUsingdowhile {
	public static int DisplayValue(int n)
	{
		int i=1,sum=0,count=0;
		do
		{
			if(i%3==0)
			{
				sum=sum+i;
				count++;
			}
			i++;
			
		}
		while(i<=n);
		System.out.println("Sum:"+sum);
		System.out.println("Count:"+count);
		return n;
	}

}
