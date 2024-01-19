import java.util.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int i,max,min;
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements in array");
        int[] numbers=new int[7];
        for(i=0;i<numbers.length;i++)
        {
            numbers[i]=s.nextInt();
        }
        max=numbers[0];
        min=numbers[0];
        for(i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
            max=numbers[i];
        }
      for(i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            min=numbers[i];
        }
        System.out.println("max="+max+" min="+min);
    }
}
