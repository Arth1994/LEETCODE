import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bigSorting{
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp;
        int[] unsorted = new int[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++)
        {
            unsorted[unsorted_i] = in.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        	for(int k=j+1;k<n;k++)
        	{
        		if(unsorted[j]>unsorted[k])
        		{
        			temp=unsorted[j];
        			unsorted[j]=unsorted[k];
        			unsorted[k]=temp;
        		}
        	}
        }
        for(int i=0;i<n;i++)
        {
        	System.out.println(unsorted[i]);
        }
    }
}
