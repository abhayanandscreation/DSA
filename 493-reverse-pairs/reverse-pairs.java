class Solution {

    int reversePairCount = 0;
    public int reversePairs(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return reversePairCount;
    }
    public void divide(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);
        countReversePairs(nums, start, mid, end);
        merge(nums, start, mid, end);
    }
    public void countReversePairs(int[] nums, int start, int mid, int end) {
        int j = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            reversePairCount += j - (mid + 1);
        }
    }
    public void merge(int[] nums, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {

            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= end) {
            temp.add(nums[right]);
            right++;
        }
        for (int i = start; i <= end; i++) {
            nums[i] = temp.get(i - start);
        }
    }
}