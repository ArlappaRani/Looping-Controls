package loopingControls;

public class Print60to25 {
	public static int Number(int n)
	{
		for(int i=60;i>=n;i--)
		{
			System.out.print(i+",");
		}
		return n;
	}

}
