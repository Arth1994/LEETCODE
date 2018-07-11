import java.util.*;

class singleNumber1 {

    public static int singleNumber(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        Arrays.sort(nums);
        // int prev = 0;
        for (int var : nums) {
            h1.put(var, 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i - 1] == nums[i]) && (i > 0) && (i< nums.length - 1)) {
                continue;
            } else if((h1.containsKey(nums[i])) && (nums[i - 1] != nums[i])){
                result = nums[i];
            }
        }
         return result;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(singleNumber(a));
    }
}
