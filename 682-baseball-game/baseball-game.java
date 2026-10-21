class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum =0;
        for(int i =0; i< operations.length; i++){
            String maamla = operations[i];
            switch(maamla){
                case "+" :
                int pehla = st.pop();
                int dusra = st.peek();
                st.push(pehla);
                st.push(pehla + dusra);
                sum += st.peek();
                break;
                case "D" :
                st.push(2*st.peek());
                sum += st.peek();
                break;
                case "C" :
                int hatao = st.pop();
                sum = sum - hatao;
                break;
                default : 
                int daalo = Integer.parseInt(maamla);
                st.push(daalo);
                sum += daalo;
            }

        }
        return sum;
    }
        
 }
