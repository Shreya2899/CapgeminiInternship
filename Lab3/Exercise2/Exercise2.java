import java.util.*;
public class Exercise2 {
       public String getImage(String str) {
    	   StringBuffer sb = new StringBuffer(str);
    	   StringBuffer sbr = new StringBuffer(str);
    	   sbr.append('|');
    	   sb.reverse();
    	   sbr.append(sb);
    	   return sbr.toString();
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Exercise2 p= new Exercise2();
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the string");
           String str=sc.nextLine();
           System.out.println(p.getImage(str));
	}

}
