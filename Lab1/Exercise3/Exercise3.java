import java.util.*;
public class Exercise3 {
	
		public static int Recursion(int n){
			if(n == 0){
				return 0;
			}
			if(n == 1 || n == 2) {
				return 1;
			}
				
		return Recursion(n-2) + Recursion(n-1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxNumber;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no. upto which you want fibonacci series");
		maxNumber = sc.nextInt();
		System.out.print("Fibonacci Series of "+maxNumber+"is");
		for(int i = 0; i<maxNumber; i++){
				System.out.print(Recursion(i) +" ");}
	}

}
