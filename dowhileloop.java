import java.util.*;
import java.util.Scanner;
class dowhileloop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        do
        {
            System.out.println("enter number between 1 and 10:");
            num=s.nextInt();
        }while(num<1||num>10);
        System.out.println(num+" is between 1 and 10");
    }
}
