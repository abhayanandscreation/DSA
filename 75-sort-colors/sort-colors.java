class Solution {
    public void sortColors(int[] nums) {
        for(int i =0 ; i<nums.length ; i++){
        int end = nums.length -i-1;
        int maxIndex = 0;
        for(int j =0 ; j<= end; j++){
            if(nums[j]> nums[maxIndex]){
                maxIndex = j;
            }
        }
        int temp = nums[maxIndex];
        nums[maxIndex]=nums[end];
        nums[end]= temp;
       }
    }
}