import java.util.*;
import java.io.*;
import java.lang.*;


public class stringBuilder1
{

	
	public static void main(String[] args)
	{
	
		String a=new String();
		Scanner scanner=new Scanner(System.in);
		a=scanner.next();
		StringBuilder s1=new StringBuilder(a);
		int len=s1.length();
		char[] arr=new char[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=s1.charAt(i);
			//System.out.print(arr[i]);
		}
		int flag=0;
		int count=0;
		char temp;
		int k;
		for(int j=0;j<len;j++)
		{
			//k=len;
			k=0;
			temp=arr[j];
			while(k<len)
			{
				if(k!=j)
				{			
					if(arr[k]!=temp)
					{
						flag++;
						//System.out.println(flag);
					}
					else if(arr[k]==temp)
						count++;		
					
				}
			k++;
			}
			temp=0;
		}
		/*System.out.println(flag);
		System.out.println(count);*/
		if(count==0)
			System.out.println("It has all  Unique characters");
		else if(count>0)
			System.out.println("NO UNIQUE");
	}
}
