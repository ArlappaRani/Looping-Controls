package loopingControls;

public class NegOddPosEvenUsingWhile {
	public int print(int Num) 
	{
		int i=-100;//initializing 
		while(i<=Num)//number is print up to user input
		{
			if(i<=1 && i%2==0 )//Checking condition both the condition will be true it print if
			{
				System.out.println(i);
				
			}
			else//if condition is false it return else condition 
			{
				System.out.println(i);
			}
			i++;//Incrementing i value
		}
		return Num;
	}

}
