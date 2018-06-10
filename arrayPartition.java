import java.util.*;
import java.io.*;


class arrayPartition
{
	public static int pairSum(int[] arr1)
	{
	
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int j=0;j<arr1.length;j++)
			h.put(arr[j],1);

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		if((size>=1)&&(size<=10000))
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
		int result=pairSum(arr);
		System.out.println(result);
	}
}
