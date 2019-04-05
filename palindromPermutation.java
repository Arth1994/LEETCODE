import java.util.*;
import java.io.*;
import java.lang.*;

class palindromPermutation
{
	public static boolean isPalindromPermutation(String phrase)
	{
		Hashtable<Character,Integer> h=new Hashtable<Character,Integer>();
		String s1=phrase.toLowerCase().replaceAll("\\s", "");		
		char[] s=s1.toCharArray();
		for (char var : s) 
		{		
			if(h.containsKey(var))
			{
				h.remove(var);		
			}				
			else
			{
				h.put(var, 1);
			}
		}
		if(h.size()>1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(isPalindromPermutation(s))
		{
			System.out.println("It is a Permutation of a Palindrome");
		}
		else
		{
			System.out.println("It is not a Permutation of a Palindrome");
		}
	}
}
