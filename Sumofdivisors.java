import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int sum=0;
		System.out.println("enter integer");
		int n=s.nextInt();
		for(int i=1;i<=n/2;i++)
		{
		    if(n%i==0)
		    sum=sum+i;
	}
	System.out.println(sum);
	}
}
