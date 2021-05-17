import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
	static String[] sortStrings(String[] arr) {
		
		//Convert array to ArrayList
		List<String> strList = new ArrayList<String>(arr.length);
		for (String i : arr)
		{
		    strList.add(i);
		}
		//get the arrayList size
		int size = strList.size();
		
		
		for(int i=0;i<size;i++)
				strList.set(i, strList.get(i).toLowerCase());					
		
		Collections.sort(strList);
				for(int i=size-1;i>=0;i--) {
			if((size%2!=0 && i>=(size/2)+1) || (size%2==0 && i>=(size/2)))
				strList.set(i, strList.get(i).toLowerCase());
			else
				strList.set(i, strList.get(i).toUpperCase());
					
		}
				final String[] res = new String[strList.size()];
		int index = 0;
		for (final String value: strList) {
		   res[index++] = value;
		}
		
		return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number number of string objects: ");
		int n = sc.nextInt();
		System.out.println("Enter the string objects:");
		String[] stringArray = new String[n];
		for(int i=0;i<n;i++) {
			stringArray[i]=sc.next();
		}
		System.out.println("\nThe Array before the operation:");
		for(int i=0;i<n;i++)
			System.out.print(stringArray[i]+" ");
		
		String[] result = sortStrings(stringArray);
		
		System.out.println("\nThe Array after the operation:");
		for(int i=0;i<n;i++)
		System.out.print(result[i]+" ");
		
		sc.close();
	}
}