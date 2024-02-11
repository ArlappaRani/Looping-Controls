package jumpingstatements;

public class PrintNumberUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10)//print up to 10 numbers
		{
			if(i==7)//if Number==7 then the iteration will be stoped
			{
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
