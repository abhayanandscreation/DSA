class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        long sum=0;
        while(sum+i <= n){
            sum += i;
            i++ ;
        }
        return i-1;
    }
}