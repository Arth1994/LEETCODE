class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if(nums.length == 0 || nums == null){
            return result;
        }
        int low = 0, high = nums.length - 1;
        while(nums[low] < nums[high]){
            int mid = (low + high)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target)
            {
                high = mid - 1;
            }else{
                if(nums[low] == nums[mid])
                {
                    high--;
                }else{
                    low++;
                }
            }
        }
        if(nums[low] == nums[high] && nums[low] == target){
            result[0] = low;
            result[1] = high;
        }
        return result;
    }
}