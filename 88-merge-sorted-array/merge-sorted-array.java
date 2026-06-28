class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=0; i<n ; i++){
        nums1[m+i]=nums2[i];
       } 
       for(int i =0 ; i<nums1.length ; i++){
        int end = nums1.length -i-1;
        int maxIndex = 0;
        for(int j =0 ; j<= end; j++){
            if(nums1[j]> nums1[maxIndex]){
                maxIndex = j;
            }
        }
        int temp = nums1[maxIndex];
        nums1[maxIndex]=nums1[end];
        nums1[end]= temp;
       }
    }
}