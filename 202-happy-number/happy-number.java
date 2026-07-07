class Solution {
    public boolean isHappy(int n) {
        int firstloop=n;
        int secondloop=n;
        do{
            firstloop= digitsquaresum(firstloop);
            secondloop= digitsquaresum(digitsquaresum(secondloop));
        }while(firstloop!=secondloop) ;
        return firstloop==1;
        

    }
    public static int digitsquaresum(int n){
        int sum =0;
         while (n > 0) {
        int digit = n % 10;
        sum= sum + (digit*digit);
        n=n/10;
         }
        return sum;
    }
}