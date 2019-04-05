import java.util.*;

class MaximumSubarray {

    public static int MaximumSubarraySum(int arr[], int k) {
        int sum = 0, max = 0;
        if (k > arr.length)
            return -1;
        else {
            for (int i = 0; i < k; i++) {
                sum = sum + arr[i];
            }
            for (int j = 1; j < arr.length - k + 1; j++) {
                int currSum = sum - arr[j - 1] + arr[j + k - 1];
                max = Math.max(currSum, sum);
                sum = currSum;
            }
            return max;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(MaximumSubarraySum(arr, k));
    }
}