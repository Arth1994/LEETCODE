import java.util.*;
import java.io.*;

//Palindrome Count
class palindromeCount
{
    public static boolean isPalindrome(int x) 
    {
        char[] a=Integer.toString(x).toCharArray();
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        int count=0,count1=0;
        for(int i=0;i<a.length;i++)
        {
            count++;
            if(h.containsKey(a[i]))
            {
                count1++;
            }
            else if(!h.containsKey(a[i]))
            {
                h.put(a[i],1);
            }
        }
        System.out.println(count);
        int count2=count1*2;
        System.out.println(count2);
        if((count==count2)||(count==count2+1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The result is as follows");
        int a=Math.abs(n);
        if(isPalindrome(a))
        {
            System.out.println("It's not a Palindrome"); 
        }
        else
        {
            System.out.println("It's not a Palindrome");
        }
    }
}