class Solution {
    public int[] searchRange(int[] nums, int target){
        int res[]={-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        res[0] = start;
        res[1] = end;
        return res;
    }
    public int search(int[] nums, int target, boolean firstorlast){
        int start = 0, end = nums.length-1, mid, ans = -1;
        while (start <= end){
            mid = start+(end-start)/2;
            if (nums[mid] == target){
                ans = mid;
                if(firstorlast){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (nums[mid] < target){
                start = mid + 1;
            }  
            if(nums[mid] > target){
                end = mid-1;
            }
        }
        return ans;
    }
}
