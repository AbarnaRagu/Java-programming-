
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i,count=0;
      
	    Scanner s=new Scanner(System.in);
		System.out.println("enter elements in array:");
		int[] numbers=new int[7];
		for(i=0;i<numbers.length;i++)
		{
		    numbers[i]=s.nextInt();
		}
		System.out.println("enter search element:");
		int search=s.nextInt();
		
	 for(i=0;i<numbers.length;i++)
	 {
	    if(search ==numbers[i])
	    {
	        count++;
	    }
	 }
	 System.out.println(+search+" occurs "+count+" times");
	}
	}
