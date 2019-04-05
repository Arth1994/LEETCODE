import java.util.*;
import java.io.*;

class stringBuilderOptimal
{

    static boolean isUniqueChars(String st)
    {
        //Considering ASCII Strings
        boolean[] char_set=new boolean[128];
        int val;
        for(int i=0;i<st.length();i++)
        {
            val=st.charAt(i);
            if(char_set[val])
            {
                return false;
            }
        char_set[val]=true;
        }
        return true;
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        s=sc.next();
        //StringBuilder str=new StringBuilder(s);
        if(isUniqueChars(s))
        {
            System.out.println("All Unique");
        }
        else
        {
            System.out.println("Not all are unique");
        }
    }
}
