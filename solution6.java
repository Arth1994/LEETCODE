import java.util.*;

//O(n)
class solution6 
{
    public static boolean judgeCircle(String moves) 
    {
        char[] c=moves.toCharArray();
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        int sum=0;
        for (char var : c) 
        {
            if((var=='U')||(var=='R'))
            {
                h.put(var, 1);
            }
            else
            {
                h.put(var,-1);    
            }
        sum=sum+h.get(var);
        }
        if(sum==0)
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
        String s=sc.next();
        if(judgeCircle(s))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}