class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        doer(nums, 0, current, ans);
        return ans;
    }
    public void doer(int[]nums, int indx, List<Integer> current, List<List<Integer>> ans){
        if(indx==nums.length){
            if(ans.contains(current)){
                return;
            }
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[indx]);
        doer(nums, indx+1, current, ans);
        current.remove(current.size()-1);
        doer(nums, indx+1, current, ans);
    }
}
    