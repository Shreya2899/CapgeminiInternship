import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Exercise4 {

	static int[] modifyArray(int arr[]) {
		
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		for (int i : arr)
		    intList.add(i);
		
		Set<Integer> intSet = new LinkedHashSet<Integer>();
        
        intSet.addAll(intList);
  
        intList.clear();
  
        intList.addAll(intSet);

		Collections.sort(intList);
		Collections.reverse(intList);
		
		final int[] res = new int[intList.size()];
		int index = 0;
		for (final Integer value: intList) {
		   res[index++] = value;
		}
				return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the " + n + " elements of the array:");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("\nArray before removing the duplicate elements and sorting it in descending order:");
		for (Integer i : array) {
	         System.out.print(i+" ");
	    }
		int[] result = modifyArray(array);
		
		System.out.println("\nArray after removing the duplicate elements and sorting it in descending order:");
		for (Integer i : result) {
	         System.out.print(i+" ");
	      }
		sc.close();

	}

}