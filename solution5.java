import java.util.*;


//Brute Force Solution for 2 Arrays
class solution5 
{
    public static boolean judgeCircle(String moves) 
    {
        char[] c=moves.toCharArray(); 
        if(((c[0]=='U')&&(c[1]=='D'))||((c[1]=='U')&&(c[0]=='D'))||((c[0]=='L')&&(c[1]=='R'))||((c[1]=='R')&&(c[0]=='L')))
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