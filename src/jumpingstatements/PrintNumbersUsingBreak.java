package jumpingstatements;

public class PrintNumbersUsingBreak {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)//number starts from1 and up to end 10
		{
			if(i==7)//when i value 7 it will stop the loop 
			{
			break;//it stop the number up to 6 it will not iterate when break the condition 	
			}
			System.out.println(i);
			i++;
		}

	}

}
