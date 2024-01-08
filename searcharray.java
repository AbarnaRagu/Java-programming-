import java.util.Arrays;   
import java.util.*;
public class Main
{     
	public static void main(String[] args) {
	    int i;
	    Scanner s=new Scanner(System.in);
	    int[] numbers=new int[5];
		System.out.println("enter elements for searching");
		for(i=0;i<numbers.length;i++)
		{
		  numbers[i]=s.nextInt();
		}
		
	    Arrays.sort(numbers);
	    
	    for(i=0;i<numbers.length;i++)
		
	    {
	        System.out.print(numbers[i]+" ");
	}
	System.out.println();

	System.out.println(Arrays.binarySearch(numbers,4));
	System.out.println(Arrays.binarySearch(numbers,2));
   System.out.println(Arrays.binarySearch(numbers,-3));

}
}
