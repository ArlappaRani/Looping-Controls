package jumpingstatements;

public class PrintNumberUsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				continue;/*continue means just skipping the value
				          the next iterations will be continued*/
			}
		System.out.println(i);
		}

	}

}
