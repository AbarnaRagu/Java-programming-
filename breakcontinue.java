import java.util.Scanner;
public class breakcontinue
{
	public static void main(String[] args) {
	    int n;
	    while(true)
	    {  
	       System.out.print("enter number between 1&10:");
	       Scanner s=new Scanner(System.in);
	       n=s.nextInt();
	      if(n<1||n>10)
	      continue;
	      break;
	}
     System.out.println(n+" is between 1 and 10");

}
}
