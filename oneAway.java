import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.io.*;

class oneAway
{
	public static boolean awayOne(String s1,String s2)
	{
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		int count=0;
		boolean c1=false,c2=false,flag=false;
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		//HashMap<CharacterInteger> h1=new HashMap<Character,Integer>();
		for(char var:a)
			h.put(var,1);
		for(char var:b)
		{
			if((a.length>b.length)&&(!h.containsKey(var)))
			{
				c1=true;
			}
			
			else if((a.length<b.length))
			{
					if((!h.containsKey(var)))
					{
						count++;
						flag=true;			
					}
			}
			else if((a.length==b.length)&&(!h.containsKey(var)))
			{
				c2=true;
			}
		}
		if(c1)
			return false;
		else if((flag)&&(count>1))
			return false;	
		else if(c2)
			return false;
		else 
		    return true;		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String ss1=sc.nextLine();
		String ss2=sc.nextLine();
		if(awayOne(ss1,ss2))
		{
			System.out.println("TRUE");		
		}
		else 
		{
			System.out.println("FALSE");
		}
	}
}
