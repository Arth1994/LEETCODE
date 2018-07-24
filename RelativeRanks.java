import java.util.*;

class Solution {
    public static String[] findRelativeRanks(int[] nums) {
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        int count = 0, c = 4;
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            h1.put(nums[i], i);
        }
        Arrays.sort(nums, 0, nums.length);
        for (int p = nums.length - 1; p >= 0; p--) {
            if (count < 3) {
                if (count == 0) {
                    strings[h1.get(nums[p])] = "Gold Medal";
                } else if (count == 1) {
                    strings[h1.get(nums[p])] = "Silver Medal";
                } else if (count == 2) {
                    strings[h1.get(nums[p])] = "Bronze Medal";
                }
            } else {
                strings[h1.get(nums[p])] = Integer.toString(c);
                c++;
            }
            count++;
        }
        return strings;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String[] s = findRelativeRanks(a);
        for (int i = 0; i < n; i++) {
            System.out.print(" " + s[i] + " ");
        }
        sc.close();
    }
}