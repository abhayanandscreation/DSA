class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length;i++) {
            sum += nums[i];
        }
        if (sum%2!= 0) {
            return false;
        }

        Boolean[][] dp = new Boolean[nums.length][sum/2+1];

        return solve(nums,0,sum/2,dp);
    }
    public boolean solve(int[]nums,int index,int target, Boolean[][]dp) {
        if (target== 0) {
            return true;
        }
        if (index== nums.length||target< 0) {
            return false;
        }
        if(dp[index][target] != null) return dp[index][target];
        boolean take = solve(nums,index+1,target - nums[index],dp);
        boolean skip = solve(nums,index+1,target,dp);
        dp[index][target] = take||skip;
        return dp[index][target];
    }
}