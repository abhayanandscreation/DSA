class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int fc = 0;
        int lc = matrix[0].length -1 ;
        int fr = 0;
        int lr = matrix.length -1 ;
        int m = matrix.length;
        int n = matrix[0].length;
        while(ans.size() < m*n){
        for(int i = fc ; i <= lc && ans.size() < m * n; i++){
            ans.add(matrix[fr][i]);
        }
        fr++ ;
        for(int i = fr ; i <= lr && ans.size() < m * n; i++){
            ans.add(matrix[i][lc]);
        }
        lc-- ;
        for(int i = lc ; i >= fc && ans.size() < m * n; i--){
            ans.add(matrix[lr][i]);
        }
        lr-- ;
        for(int i = lr ; i >= fr && ans.size() < m * n; i--){
            ans.add(matrix[i][fc]);
        }
        fc++ ;
       }
       return ans ;
    }
}