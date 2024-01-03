import java.util.Scanner;
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.print("enter string:");
		String str=s.nextLine();
		boolean isPalindrome=true;
		for(int i=0,j=str.length()-1;i<j;i++,j--)
		{
		    if(str.charAt(i)==str.charAt(j))
		    continue;
		 isPalindrome=false;
		 break;
		}
		System.out.print(isPalindrome?"pallindrome":"not pallindrome");
	}
}
