
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i;
      float sum=0,mul=1,avg;
	    Scanner s=new Scanner(System.in);
		System.out.println("enter elements in array:");
		int[] numbers=new int[5];
		for(i=0;i<numbers.length;i++)
		{
		    numbers[i]=s.nextInt();
		}
		
	 for(i=0;i<numbers.length;i++)
	 {
	    sum=sum+numbers[i];
	 }
	 System.out.println("Sum="+sum);
	
	for(i=0;i<numbers.length;i++)
	{
	    mul=mul*numbers[i];
}
System.out.println("mul="+mul);
	    avg=sum/numbers.length;
System.out.println("avg="+avg);
}
}
