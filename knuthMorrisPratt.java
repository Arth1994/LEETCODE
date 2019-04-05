import java.util.*;

public class knuthMorrisPratt {
    static int[] patternToArray(String pattern) {
        int[] arr = new int[pattern.length()];
        int prev = 0;
        if (pattern.length() == 0 || pattern.charAt(0) == ' ')
            return null;
        arr[prev] = 0;
        for (int i = 1; i < pattern.length(); ) {
            if (pattern.charAt(prev) == pattern.charAt(i)) {
                arr[i] = prev + 1;
                prev++;
                i++;
            } else {
                if (prev != 0) {
                    prev = arr[prev - 1];
                } else {
                    arr[i] = 0;
                    i++;
                }
            }
        }
        return arr;
    }

    static boolean stringCompare(String text, String pattern) {
        int arr[] = patternToArray(pattern);
        int j = 0;
        for (int i = 0; i < text.length(); ) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = arr[j - 1];
                } else {
                    i++;
                }
            }
        }
        return j == pattern.length();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        if (stringCompare(text, pattern)) {
            System.out.println("It contains the required substring");
        } else {
            System.out.println("It does no contain the required SubString");
        }
    }
}
