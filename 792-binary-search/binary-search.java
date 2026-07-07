class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
         return bsearch(nums,target,0,n-1);
    }
    public int bsearch(int[] nums, int target, int left, int right){
        int mid= left+ (right-left)/2;
        if(left>right) return -1;
        if(nums[mid]==target) return mid;
        else if(nums[mid]> target) return bsearch(nums, target, left, mid-1);
        else return bsearch(nums, target, mid+1, right);
    }
}