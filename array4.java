class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length-1, fe = -1, le = -1;
       while(start<=end){
        int mid = start+(end-start)/2;
        if (nums[mid] == target){
            fe = mid;
            end = mid - 1;
        }
        if (nums[mid] < target){
            start = mid + 1;
        } else {
            end = mid - 1;
        }
       }
        start = 0;
        end = nums.length-1;
       while(start<=end){
        int mid = start+(end-start)/2;
        if (nums[mid] == target){
            le = mid;
            start = mid + 1;
        } if (nums[mid] < target){
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }
       }
       int ans[] = {fe, le};
       return ans;
    }
}
