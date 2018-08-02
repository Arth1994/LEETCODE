import java.util.*;

class firstUniqChar
{

    public static int firstUniq(String s) 
    {
        s.toLowerCase();
        HashMap<Character, Integer> h = new HashMap<>();
        int c = 1;
        for(int i = 0; i < s.length(); i++)
        {
            if(h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i), c++);
                //
            }    
            h.put(s.charAt(i), c);
            c = 1;
        }

        for(int j = 0; j < s.length(); j++)
        { 
            if(h.get(s.charAt(j)) == 1)
                return j;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = firstUniq(s);
        System.out.print(a);
        sc.close();
    }
}