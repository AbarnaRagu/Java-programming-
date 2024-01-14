import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int i,j;
	    int[] a={1,1,2,2,3,4,4,5,7,9,7,5};

	    for(i=0;i<a.length-1;i++)
	   {
	   boolean isnondup=true;

	       for(j=0;j<a.length;j++){
	       if((a[i]==a[j])&&(i!=j))
	       {
	        isnondup=false;
	       }
	   }
	   if(isnondup)
	   {
	   System.out.print(a[i]+" ");
	   }
	}
}
}
