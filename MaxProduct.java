class MaxProduct {
    public int maxProduct(int[] nums) {
        if(nums.length == 0 || nums == null)
            return 0;
        
        int len = nums.length;
        
        //Base Case 1st Element
        int result = nums[0];
        int max = result, min = result;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] >= 0){
                max = Math.max(nums[i], nums[i] * max);
                min = Math.min(nums[i], nums[i] * min);
            }else{
                int temp = max;
                max = Math.max(nums[i], nums[i] * min);
                min = Math.min(nums[i], nums[i] * temp);
            }
            result = Math.max(result, max);
        }
        return result;
    }
}