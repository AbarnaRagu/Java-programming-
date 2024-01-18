import java.util.*;
import java.util. Arrays;
public class Main
{
	public static void main(String[] args) {
	    
		int[][] a={{6,2,-1},{4,-3,9},{7,8,-5}};
		printarray(a);
		sumofrows(a);
		sumofcolumn(a);
		maxofrow(a);
		minofrow(a);
	}
private static void printarray(int[][] a)
{   int i,j;
    for(i=0;i<a.length;i++)
    {
        for(j=0;j<a[i].length;j++){
        System.out.print(a[i][j]+" ");
    }
System.out.println();
}
}

private static void sumofrows(int[][] a)
{    int i,j;
    for(i=0;i<a.length;i++)
    {
        int sr=0;
    for(j=0;j<a[i].length;j++)
    {
        sr=sr+a[i][j];
    }
    System.out.println("sum of row"+" "+(i+1)+"="+sr);
}
}
private static void sumofcolumn(int[][] a)
{    int i,j;
    for(i=0;i<a.length;i++)
    {
        int sc=0;
    for(j=0;j<a[i].length;j++)
    {
        sc=sc+a[j][i];
    }
    System.out.println("sum of column"+" "+(i+1)+"="+sc);
}
}
private static void maxofrow(int[][] a)
{    int i,j;
    for(i=0;i<a.length;i++)
    {
        int max=0;
    for(j=0;j<a[i].length;j++)
    {
        if(a[i][j]>max)
        max=a[i][j];
    }
    System.out.println("maximum of row"+" "+(i+1)+"="+max);
}
}
private static void minofrow(int[][] a)
{    int i,j;
    for(i=0;i<a.length;i++)
    {
        int min=0;
    for(j=0;j<a[i].length;j++)
    {
        if(a[i][j]<min)
        min=a[i][j];
    }
    System.out.println("minimum of row"+" "+(i+1)+"="+min);
}
}
}
