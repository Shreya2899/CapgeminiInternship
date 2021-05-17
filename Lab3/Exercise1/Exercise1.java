import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the digits seperated by spaces");
		String digits = sc.nextLine();
		StringTokenizer token = new StringTokenizer(digits);
		int dig=0, sum=0;
		System.out.println("Entered digits are:");
		while(token.hasMoreTokens()) {
			String s=token.nextToken();
			dig = Integer.parseInt(s);
			System.out.println(dig+" ");
			sum= sum + dig;
		}
		System.out.println("The sum of the given digits are:"+sum);

	}

}
