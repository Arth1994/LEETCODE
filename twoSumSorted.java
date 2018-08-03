import java.util.*;

class twoSumSorted {

    public static int[] twoSum(int[] numbers, int target) 
    {
        int[] ans = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if ((numbers[i] + numbers[j] == target)) {
                        if (numbers[i] < numbers[j]) {
                            ans[0] = i + 1;
                            ans[1] = j + 1;
                        } else {
                            ans[0] = j + 1;
                            ans[1] = i + 1;
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int c = 0; c < n; c++)
            a[c] = sc.nextInt();
        int t = sc.nextInt();
        int[] a1 = twoSum(a, t);
        for (int x = 0; x < a1.length; x++)
            System.out.println(a1[x]);
        sc.close();
    }

}