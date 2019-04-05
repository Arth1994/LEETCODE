import java.util.*;
import java.io.*;


public class arrayList2
{


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(400);
		a.add(100);
		a.add(2000);
		a.add(300);
		
		System.out.println("Before Sorting\n"+a);
		Collections.sort(a);
		System.out.println("After Sorting\n"+a);
	
		int index=Collections.binarySearch(a,n);
		System.out.println(index);
	}
}
