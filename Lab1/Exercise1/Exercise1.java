import java.util.*;
public class Exercise1 {

	public static void cube()
		{
			int sum=0;
			
			int a;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the no.");
			a=sc.nextInt();
			
			while(a!=0)
			{
				int r;
				r=a%10;
				sum=sum+r*r*r;
				a=a/10;
				
			}
			System.out.println("The required no. is:-"+sum);

		}
		

		public static void main(String[] args) {
		   cube();
			
			
		}	
			
		


	}


