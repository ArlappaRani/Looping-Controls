package loopingControls;

public class NegOddPosEven {
	public int DisplayNumber(int num)
	{
		for(int i=-100;i<=num;i++)//Taking range from -100 to +100(user input)
		{
			if(i<=1 && i%2!=0)//condition for negative number and odd number 
			{
				System.out.print(i+",");
			}
			else
			{
				System.out.print(i+",");
			}
			
		}
		return num; 
	}

}
