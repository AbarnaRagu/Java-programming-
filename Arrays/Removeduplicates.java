import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i, j=0;
	    int[] a={2,3,2,4,5,4,5,8,7,1,3};
	    Arrays.sort(a);
	    int[] temp=new int[a.length];
	    for(i=0;i<a.length-1;i++)
	    {
	        if(a[i]!=a[i+1])
	        {
	            temp[j]=a[i];
	            j++;
	        }
	    }
	    temp[j++]=a[a.length-1];
       for(int k=0;k<j;k++)
       {
           System.out.print(temp[k]+" ");
       }
	    
	}
}
