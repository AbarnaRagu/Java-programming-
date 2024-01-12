import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i,j=0;
     int[] a={1,5,6,7};
     int[] b={2,4,8,9,11};
     int[] c=new int[a.length+b.length];
     int k=c.length-1;
     for(i=0;i<a.length;i++)
     {
         c[j]=a[i];
         j++;
     }
     for(i=0;i<b.length;i++)
     {
         c[k]=b[i];
         k--;
     }

	    Arrays.sort(c);
      System.out.print(Arrays.toString(c));
	}
}
