class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(temp < 0){
                 temp = temp * -1;
            }
            int digit = 0;
            digit = (int)(Math.log10(temp))+1;
            if (digit%2==0){
                count++;
            }
        }
        return count;
    }
    }
