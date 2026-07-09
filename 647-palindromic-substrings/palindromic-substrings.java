class Solution {
    public int searchpal(String s, int left, int right){
        int count= 0;
        while(left>=0 && right< s.length() && s.charAt(left)==s.charAt(right)){
          count++ ;
            left--;
            right++;
        }
       return count;
    }
    public int countSubstrings(String s) {
         if (s == null || s.length() < 2)
            return s.length();
        int count= 0;
        for(int i=0; i<s.length(); i++){
            count += searchpal(s,i,i);
            count += searchpal(s,i,i+1);
            }
        return count;
    }
    
}