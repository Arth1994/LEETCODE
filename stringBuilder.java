import java.util.*;
import java.io.*;
import java.lang.*;

public class stringBuilder
{

	public static void main(String[] args)
	{
	
	 	String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		int len=s.length();
		StringBuilder s1=new StringBuilder(s);
		char[] a=new char[len];
		char[] temp=new char[len];
		for(int i=0;i<s.length();i++)
		{
			a[i]=s1.charAt(i);
			System.out.print(a[i]);
		}
		System.out.println();
		for(int j=(s.length()-1);j>=0;j--)
		{
			temp[j]=s1.charAt(j);
			System.out.print(temp[j]);
		}
		System.out.println();
		StringBuilder s2=new StringBuilder(s1.reverse());
		System.out.print(s2);
		if(!(s1.toString().equals(s2.toString())))
				System.out.println("Not a Palindrome");
		else
				System.out.println(" Palindrome");

	}
}
