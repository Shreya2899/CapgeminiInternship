import java.util.*;

public class Exercise3 {
	static int[] getSorted(int array[]) {
		String[] stringArray = new String[array.length];
		int[] intArray= new int[array.length];
		List<Integer> intList = new ArrayList<Integer>(array.length);
		System.out.println();
		for(int i=0;i<array.length;i++) {
			stringArray[i]=String.valueOf(array[i]);
					}
		for(int i=0;i<array.length;i++) {
			 String reverse = new StringBuffer(stringArray[i]).reverse().toString();
			 
		     stringArray[i]=reverse;
		     		}
		
		for(int i=0;i<array.length;i++) {
			intArray[i]=Integer.parseInt(stringArray[i]);
		     
		}
		
		for (int i : intArray)
		{
		    intList.add(i);
		}
		Collections.sort(intList);
		
		
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
		
		System.out.println("\nArray before operation:");
		for (Integer i : array) {
	         System.out.print(i+" ");
	    }
		int[] result = getSorted(array);
		
		System.out.println("\nArray after operation:");
		for (Integer i : result) {
	         System.out.print(i+" ");
	      }
		sc.close();
		
	}

}