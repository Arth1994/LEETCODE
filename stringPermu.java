import java.util.*;
import java.io.*;

class stringPermu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=new String();
		String s2=new String();
		int n=s1.length();
		s1=sc.next();
		s2=sc.next();
		char[] a=new char[n];
		char[] b=new char[n];
		Arrays.sort(b);
		Arrays.sort(a);
		if((Arrays.equals(a,b)))
		{
			System.out.println("It's a Permutation");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}
