import java.util.*;
import java.io.*;

class stringCompression
{
	public static void compressString(String s)
	{
		char[] a=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		int temp=1,count=1;		
		for(char var:a)
		{
			if(h.containsKey(var))
			{
				h.put(var,count+(temp++));
			}
			else
			{
				h.put(var,1);
				temp=count;
			}
		}
		int j=0;
		Iterator it=h.entrySet().iterator();
		System.out.println("The resulting string is as follows:-\n");
		while(it.hasNext())
		{
			Map.Entry p=(Map.Entry)it.next();
			System.out.print(p.getKey()+""+p.getValue());
		}
		System.out.println(" ");
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		compressString(string);
	}
}

