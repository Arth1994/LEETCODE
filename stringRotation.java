import java.util.*;
import java.io.*;

class stringRotation {

    static int isSubstring(String str1, String str2) {
        int M = str1.length();// length of smaller string
        int N = str2.length();// length of larger string
        for (int i = 0; i < N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (str2.charAt(i + j) != str1.charAt(j))
                    break;

            if (j == M) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1, str2, str3;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        str3 = str1 + str1;
        int res = isSubstring(str2, str3);
        if (res == -1) {
            System.out.println("Not a Rotation");
        } else {
            System.out.println("It's a Rotation");
        }
    }
}