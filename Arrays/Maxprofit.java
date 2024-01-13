
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Main
{	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);

	    int i;
	    int a[]=new int[7];
		System.out.println("enter prices");
		for(i=0;i<a.length;i++)
		{
		    a[i]=s.nextInt();
		}
		int buy=Integer.MAX_VALUE;
		int profit=0;
    	for(i=0;i<a.length;i++)
		{
		    if(a[i]<buy)
		    {
		        buy=a[i];
		    }
		    if(a[i]-buy>profit)
		    {
		        profit=a[i]-buy;
		    }
		}

        System.out.print("Maximum profit is:"+profit);
	}
}
