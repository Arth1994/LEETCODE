import java.util.*;
import java.io.*;

class maxOnes {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, prevCount = 0, currCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currCount++;
                if (i == nums.length - 1) {
                    if (currCount > prevCount) {
                        max = currCount;
                    } else {
                        max = prevCount;
                    }
                }
            } else if ((nums[i] != 1) && (i == nums.length - 1)) {
                if (currCount > prevCount)
                    max = currCount;
                else
                    max = prevCount;
            } else if (nums[0] == 0) {
                max = 0;
            } else if ((nums[i - 1] != nums[i]) && (nums[i] != 1)) {
                prevCount = currCount;
                currCount = 0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(a));
    }
}