import java.util.*;
import java.io.*;

class solution7
{
    public static boolean isPalindrome(int x) 
    {
        char[] a=Integer.toString(x).toCharArray();
        int j=0,count=0;
        boolean flag=false;
        if(x<0)
        {
            return false;
        }
        else if(a.length==1)
        {
            return true;
        }
        else
        {
            for(int i=a.length-1;i>=(a.length/2);i--)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
                else
                {
                    flag=true;
                }
            j++;
        }
        System.out.println(count);
        if(count%2==0)
            return true;
        else
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("It's not a Palindrome");
        }
        else if(isPalindrome(n)&&(n>0))
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not Palindrome");
    }
}