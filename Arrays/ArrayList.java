import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList <Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    	System.out.println(numbers);
    	System.out.println("size="+numbers.size());
        numbers.add(1,5);
        System.out.println("size="+numbers.size());

        System.out.println(numbers);
        numbers.set(2,4);
        System.out.println("element at index 1="+numbers.get(1));
        numbers.add(2,7);
        System.out.println(numbers);

        System.out.println("element at index 2="+numbers.get(2));

        numbers.remove(3);
		System.out.println(numbers);
		numbers.clear();
		System.out.println(numbers);

	}
}
