
import java.util.*;
import java.util.Arrays;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    int i;
	    Scanner s=new Scanner(System.in);
		System.out.println("enter elements:");
		int[] a=new int[5];
		for(i=0;i<a.length;i++)
		{
		    a[i]=s.nextInt();
		}
		int sum=a[0];
		int maxsum=a[0];
		for(i=1;i<a.length;i++)
		{
		    if(sum<0)
		    {
		        sum=a[i];
		    }
		    else{
		        sum=sum+a[i];
		    }
		    maxsum=Math.max(sum,maxsum);
		        
		    }
		    System.out.print("maxsum="+maxsum);		}
}
