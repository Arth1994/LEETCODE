import java.util.*;
import java.io.*;
import java.lang.*;

class solution2 
{
    public static int numJewelsInStones(String J, String S) 
    {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        char[] a=J.toCharArray();
        char[] b=S.toCharArray();
        int c=0;
        for (char var1 : a) 
        {
            h.put(var1, 1);
        }
        
        for(char var2:b)
        {
            if(h.containsKey(var2))
            {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String J1=sc.nextLine();
        String S1=sc.nextLine();
        int result=numJewelsInStones(J1,S1);
        System.out.println(result);
    }
}