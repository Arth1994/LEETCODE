class LengthOfLis {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length == 0 || nums == null)
            return 0;
        
        int len = nums.length;
        
        int cache[] = new int[len];
        
        int max = 1;
        
        for(int i = 0; i < len; i++){
            cache[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    cache[i] = Math.max(cache[i], 1 + cache[j]);
                    max = Math.max(cache[i], max);
                }
            }
        }
        
        return max;
        
    }
}