import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int i,j;
	    		System.out.println("enter number of rows:");
	    		int rows=s.nextInt();
                int n=rows/2;
	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	     	System.out.print("* ");
	        }
	        System.out.println();
	    }
	    	for(i=1;i<=n;i++)
	    {
	        for(j=n-1;j>=i;j--)
	        {
	     	System.out.print("* ");
	        }
	        System.out.println();
	    }

	}
            }
