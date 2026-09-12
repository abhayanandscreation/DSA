class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< s.length(); i++){
            Character ch = s.charAt(i);
            if(stack.size() >0 && stack.peek()== ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        String ans = "" ;
        for(int i=0; i< stack.size(); i++){
            ans += stack.get(i);
        }
        return ans;
    }
}