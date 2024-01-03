import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("enter age:");
		int age=s.nextInt();
		if(age<12)
		System.out.println("child ticket:$5");
		else if(age>=12&&age<=18)
		System.out.println("student ticket:$8");
		else if(age>=19&&age<=65)
		System.out.println("adult ticket:$10");
	    else
		System.out.println("senior ticket:$7");
	}
	}

