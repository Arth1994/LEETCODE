import java.util.*;
import java.io.*;

class matrixZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0)
                {
                    a.add(i);
                    a.add(j);
                }
            }
        }
        for(int k=0;k<a.size();k++)
        {
            if(k%2==0)
            {
                for(int x=0;x<n;x++)
                        arr[a.get(k)][x]=0;                
            }
            else if(k%2==1)
            {
                for(int y=0;y<m;y++)
                        arr[y][a.get(k)]=0;                
            } 
        }
        for(int i1=0;i1<m;i1++)
        {
            for(int j1=0;j1<n;j1++)
            {
                System.out.println(arr[i1][j1]);
            }
        }
    }
}