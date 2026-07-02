class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<= nums.length-1; i++){
            if(nums[i]< min){
                min= nums[i];
            }
            if(nums[i]>max){
                max= nums[i];
            }
        }
        return GCD(max% min, min);
    }
    public static int GCD(int min, int max){
        if(min ==0) return max;
        return GCD(max% min, min);
}
    }