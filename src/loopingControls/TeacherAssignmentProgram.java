package loopingControls;

public class TeacherAssignmentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//for Schools
		{
		 for(int j=1;j<=2;j++)//for classes
		 {
			 for(int k=1;k<=10;k++)//for students
			 {
				 if(i%2!=0 && k%2==0)
				 {
					 System.out.println("Student"+" "+k+" "+"of class"+" "+j+" "+"of School"+" "+i+
							" "+"Have completed the assisgnment" );
				 }
				 else if(i%2==0 && k%2!=0)
				 {
					 System.out.println("Student"+" "+k+" "+"of class"+" "+j+" "+"of School"+" "+i+
								" "+"Have  not completed the assisgnment" ); 
				 }
				 else
				 {
					 System.out.println("Student"+" "+k+" "+"of class"+" "+j+" "+"of School"+" "+i+
								" "+"Have still doing the assisgnment" );
				 }
			 }
		 }
			 
		 }
		
	}


		

	}


