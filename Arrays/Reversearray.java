
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Main
{	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);

	    int i;
	    int a[]=new int[7];
		System.out.println("enter element");
		for(i=0;i<a.length;i++)
		{
		    a[i]=s.nextInt();
		}int c;
		int l=a.length;
		for(i=0;i<a.length/2;i++)
		{
		    c=a[i];
		    a[i]=a[l-i-1];
		    a[l-i-1]=c;
		}
        System.out.print(Arrays.toString(a));
}
}
