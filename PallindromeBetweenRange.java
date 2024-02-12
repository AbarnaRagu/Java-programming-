import java.util.*;
public class Main
{
    
    
public static int reverse(int n)
{
    int temp=n;
    int r,sum=0;
    while(n>0)
    {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    return sum;
}
	public static void main(String[] args) {
      for(int i=100;i<200;i++)
      {
          if(i==reverse(i))
          {
              System.out.print(i+" ");
          }
      }
	}
}
