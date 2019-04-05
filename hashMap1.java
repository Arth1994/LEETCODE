import java.util.*;
import java.io.*;


public class hashMap1
{


	public static void main(String args[])
	{
	
	 	HashMap<Integer,String> h1 =new HashMap<Integer,String>(5);

		h1.put(1,"A");
		h1.put(2,"B");
		h1.put(3,"C");
		h1.put(4,"D");;
		h1.put(5,"E");

		//System.out.println(h1.size());	 
		
		Set s=h1.entrySet();
		Iterator i=s.iterator();
		
		System.out.println("The Hash Map Version1 is as as follows");
		
		while(i.hasNext())
		{
		
			Map.Entry m1=(Map.Entry)i.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		
		}
		
		System.out.println("The Hash Map Version2 is as follows");
		h1.remove(3);
		Set s1=h1.entrySet();
		Iterator i2=s1.iterator();

		while(i2.hasNext())
		{
		
			Map.Entry m2=(Map.Entry)i2.next();
			System.out.println(m2.getKey()+" "+m2.getValue());
		}



	}



}
