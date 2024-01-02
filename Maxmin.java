import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,min,max;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter number");
	     n=s.nextInt();
	     min=n;
	    max=n;
	    while(n>0)
	    {   n=s.nextInt();
	        if(n<0)
	        break;
	        if(n>max)
	        max=n;
	        if(n<min)
	        min=n;
	        
	    }
	    System.out.println("max="+max+" min ="+min);
	    
			}
}
