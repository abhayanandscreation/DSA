class Solution {
    public int[] sortArray(int[] nums) {
        /*for(int i=0; i<nums.length; i++){
            int end = nums.length-i-1;
            int maxindex=0;
            for(int j=0; j<=end; j++){
                if(nums[j]> nums[maxindex]){
                    maxindex= j;
                }
            }
            int temp= nums[maxindex];
            nums[maxindex]= nums[end];
            nums[end]=temp;
        }
    return nums;*/
    Arrays.sort(nums);
    return nums;
    }
}