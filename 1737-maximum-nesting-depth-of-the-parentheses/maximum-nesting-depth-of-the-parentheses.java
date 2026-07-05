class Solution {
    public int maxDepth(String s) {
        int open =0;
        int maxopen =0;
        for(int i=0; i<s.length(); i++){
            if(open > maxopen){
                maxopen= open;
            }
            if(s.charAt(i)=='(') open ++ ;
            if(s.charAt(i)==')') open -- ;
        }
        return maxopen;
    }
}