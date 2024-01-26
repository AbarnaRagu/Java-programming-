
import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i,j;
	    int[] a={1,2,3,7,4,5,6};
	    int[] b={0,4,5,2,7,10,8};
	    int[] c={3,4,7,9,5,1};
	    int[] temp=new int[a.length];
	    for(i=0;i<a.length;i++)
	    {
	        for(j=0;j<b.length;j++)
	        {
	            if(a[i]==b[j])
	            {
	                temp[i]=a[i];
	            }
	        }
	    }
	    System.out.print("the common elements are:");
	    for(i=0;i<temp.length;i++)
	    {
	        for(j=0;j<c.length;j++)
	        {
	        if(temp[i]==c[j])
	        {
	            System.out.print(temp[i]+" ");
	        }
	    }
	}
}
}
