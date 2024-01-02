import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    boolean isPrime=true;
	    Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		for(int i=2;i<=n/2;i++)
		{
		    if(n%i==0)
		    isPrime=false;
		}
		System.out.println(isPrime?"Prime":"Not Prime");
	}
}
