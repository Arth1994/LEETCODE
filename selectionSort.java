import java.util.*;
import java.io.*;

class selectionSort
{
	public static void main(String args[])
	{
	

		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		
			a[i]=sc.nextInt();
		}

		int temp;
		int min;
		int flag=0;
		int x=0;
		for(int j=0;j<n-flag;j++)
		{
			min=j;		
			for(int k=j+1;k<n;k++)
			{
				if(a[k]<a[min])
				{
					min=k;
				}
			
			}
			if(min!=j)
			{
				temp=a[min];
				a[min]=a[j];
				a[j]=temp;	
			}
			flag++;	
			//System.out.println();
		}
		//System.out.print(a[0]);
		System.out.println("Your Output is as follows:");
		for(int l=0;l<n;l++)
		{
		
			System.out.print(a[l]);
			System.out.println();

		}

	}


}
