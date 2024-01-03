import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
		    reverse=reverse+str.charAt(i);
		}
		    System.out.print(reverse);
		    }
}
