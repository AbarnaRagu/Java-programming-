import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter grade");
	    char Grade=s.next().charAt(0);
	    char encrypt=encrypt(Grade); 
	     System.out.println("encrypted Grade is "+encrypt);
	    System.out.println("decrypted Grade is "+decrypt(encrypt));
	}
	public static char encrypt(char Grade)
	{
	    Grade=(char)(Grade+8);
	    return Grade;
	}
		public static char decrypt(char encrypt)
	{
	    encrypt=(char)(encrypt-8);
	    return encrypt;
	}

}
