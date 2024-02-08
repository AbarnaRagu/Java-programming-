import java.util.*;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) { 
        int i,j;
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        
        System.out.println("enter array elements");
        for(i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("enter sum");
        int sum=s.nextInt();
                for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {  
                if(a[i]+a[j]==sum){
                System.out.println(a[i]+","+a[j]);
                }
            }
            
        }
        
        
    }
}
