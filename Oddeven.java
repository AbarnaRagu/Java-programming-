import java.util.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int i,j=0,k;
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements in array");
        int[] numbers=new int[7];
        for(i=0;i<numbers.length;i++)
        {
            numbers[i]=s.nextInt();
        }
        int[] temp=new int[numbers.length];
        k=numbers.length-1;
        for(i=0;i<numbers.length;i++)
        {
            if(numbers[i]%2!=0)
            {
                temp[j]=numbers[i];
                j++;
            }
            else
            {
                temp[k]=numbers[i];
                k--;
                
            }
        }
            for(i=0;i<temp.length;i++)
            {
                numbers[i]=temp[i];
            }
       
            System.out.println(Arrays.toString(numbers));
        }
    }
