import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);

		System.out.println("enter english marks");
		int english=s.nextInt();
		System.out.println("enter maths marks");
		int maths=s.nextInt();
     	System.out.println("enter science marks");
		int science=s.nextInt();
		int percentage=((english+maths+science)/3);
     
           if(english>=33&&maths>=33&&science>=33&&percentage>=40)
               {
               System.out.println(" you are pass!");
               }
           else{
             System.out.println(" you are fail!");

           }
           
       }

		
	}
