import java.util.*;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	    	     ArrayList <Integer> a=new ArrayList<>();

	    	     int choice,ch;
	     while(true)
	     {
	       System.out.println("enter the choice \n1.add \n2.remove \n3.display \n4.exit");
	       choice=s.nextInt();
	       
		switch(choice)
		{
		    case 1:add(a);break;
		   case 2:remove(a);break;
		    case 3: display(a);break;
		    case 4:System.exit(0);
          }
}
}
private static void add(ArrayList<Integer> a)
{
        Scanner s=new Scanner(System.in);
    System.out.print("enter element to add:");
    int temp=s.nextInt();
    a.add(temp);
}
private static void display(ArrayList<Integer> a)
{
System.out.println(a);
}
private static void remove(ArrayList<Integer> a)
{   Scanner s=new Scanner(System.in);
    System.out.print("enter the position to be removed:");
    int pos=s.nextInt();
    a.remove(pos);
}
}
