import java.util.*;
import java.io.*;

public class hashMap2
{

	public static void main(String args[])
	{

		HashMap<Integer,String> h1=new HashMap<Integer,String>();
	
	 	h1.put(1,"MUFC");
		h1.put(2,"CFC");
		h1.put(3,"AFC");
		h1.put(4,"BARCA");;
		h1.put(5,"REALMADRID");

		System.out.println("Map Before Sorting");
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		
		while(i1.hasNext())
		{
			Map.Entry m1=(Map.Entry)i1.next();
			System.out.print("\n"+m1.getKey()+" "+m1.getValue()+"\n");
		}


		System.out.println("Map After  Sorting");
		HashMap h2=sortByValues(h1);
		Set s2=h2.entrySet();
		Iterator i2=s2.iterator();
		
		while(i2.hasNext())
		{
			Map.Entry m2=(Map.Entry)i2.next();
			System.out.print("\n"+m2.getKey()+" "+m2.getValue()+"\n");
		}

	}

	private static HashMap sortByValues(HashMap h)
	{
	
		List l1=new LinkedList(h.entrySet());
		Collections.sort(l1,new Comparator(){
		
			public int compare(Object ob1,Object ob2)
			{
			
				return ((Comparable) ((Map.Entry) (ob1)).getValue()).compareTo(((Map.Entry) (ob2)).getValue());

			}
		
		});

		
		HashMap<Object,Object> hmap =new LinkedHashMap<Object,Object>();
		Iterator i2=l1.iterator();
		while(i2.hasNext())
		{
			Map.Entry m1=(Map.Entry)i2.next();
			hmap.put(m1.getKey(),m1.getValue());

		}
	
		return hmap;
	}
}

