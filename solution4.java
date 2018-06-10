import java.util.*;
import java.io.*;

class solution4 
{
    public static  int hammingDistance(int x, int y) 
    {
        int c1=0;
        String x1=Integer.toBinaryString(x);
        String y1=Integer.toBinaryString(y);
        int diff=Math.abs((x1.length()-y1.length()));
        while(diff>0)
        {
            if(x1.length()<y1.length())
            {
                x1="0"+x1;
            }
            else if(x1.length()>y1.length())
            {
                y1="0"+y1;
            }
        diff--;
        }
        char[] x2=x1.toCharArray();
        char[] y2=y1.toCharArray();
        for(int i=0;i<x1.length();i++)
        {
            if(x2[i]!=y2[i])
            {
                c1++;
            }
        }
    return c1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=hammingDistance(a,b);
        System.out.println(result);
        /*String yy=Integer.toBinaryString(a);
        String yy1=Integer.toBinaryString(b);
        System.out.println(yy);
        System.out.println(yy1);
        */
    }
}