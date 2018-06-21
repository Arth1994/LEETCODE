
import java.util.*;

class Solution {
	public static char findTheDifference(String s, String t) {
           HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
char[] a = s.toCharArray();
	for(int i=0; i<a.length; i++)
		h1.put(a[i], 1);
	char[] b = t.toCharArray();
	foreach(char p in b)
		if(!h1.containsKey(p))
			return p;

    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String t1 = sc.nextLine();
		String r1 = s1.tLowerCase();
		String r2 = t1.toLowerCase();
		System.out.print(findTheDifference(r1, r2));
	}
}
