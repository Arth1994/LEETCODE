import java.util.*;
import java.lang.*;
import java.io.*;

class insertionSort
{
    public static void main(String []args)
    {

        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt();
        }
        int temp=a[n];
        System.out.println(temp);
    }
}