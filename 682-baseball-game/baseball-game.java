class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i =0; i< operations.length; i++){
            String maamla = operations[i];
            switch(maamla){
                case "+" :
                int pehla = st.pop();
                int dusra = st.peek();
                st.push(pehla);
                st.push(pehla + dusra);
                break;
                case "D" :
                st.push(2*st.peek());
                break;
                case "C" :
                st.pop();
                break;
                default : 
                st.push(Integer.parseInt(maamla));
            }

        }
        int sum =0;
        while(st.size()>0){
            sum += st.pop();
        }
        return sum;
    }
}