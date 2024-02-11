package loopingControls;

public class NegOddPosEvendowhile {
	public int DisplayNumbers(int num)
	{
		int i=-100;//Initialization
		do//writing instructions under do
		{
			if(i<=num && i%2!=0)//condition is true if executes otherwise else
			{
			System.out.println(i);
			}
			else
			{
				System.out.println(i);
			}
			i++;//Incrementing the value
		}
		while(i<=num);
		return num;
	}
		
	}


