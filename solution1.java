import java.util.*;
import java.io.*;


class solution1
{
	public static int[] twoSum(int[] nums,int target)
	{
	
		int sum=0;
		int[] sumArray=new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				sum=nums[i]+nums[j];
				if(sum==target)
				{
					sumArray[0]=i;
					sumArray[1]=j;
				}
			sum=0;
			}
		}
		return sumArray;
	}

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int j=0;j<n;j++)
			a[j]=sc.nextInt();
		int[] arr=twoSum(a,t);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
}
