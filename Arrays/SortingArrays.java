import java.util.Arrays;   
import java.util.*;
public class Main
{     
	public static void main(String[] args) {
	    int i;
	    Scanner s=new Scanner(System.in);
	    int[] numbers=new int[5];
		System.out.println("enter elements for sorting");
		for(i=0;i<numbers.length;i++)
		{
		  numbers[i]=s.nextInt();
		}
		System.out.println("before sorting:");
		for(i=0;i<numbers.length;i++)
		
	    {
	        System.out.print(numbers[i]+" ");
	    }
	    Arrays.sort(numbers);
	    System.out.println("after sorting");
	    for(i=0;i<numbers.length;i++)
		
	    {
	        System.out.print(numbers[i]+" ");
	}
}
}
