
import java.util.Stack;

class TextEditor {
    Stack<Character >left;
    Stack<Character >right;
    public TextEditor(){
        left= new Stack<>();
        right= new Stack<>();
    }
    public void addText(String text) {
        for(char ch : text.toCharArray()){
            left.push(ch);
        }
    }
    public int deleteText(int k){
        int deleted = 0;
        while (k> 0 && !left.isEmpty()){
            left.pop();
            deleted++;
            k--;
        }
        return deleted;
    }
    public String cursorLeft(int k){
        while (k > 0 && !left.isEmpty()){
            right.push(left.pop());
            k--;
        }
         return getLast10();
    }
      public String cursorRight(int k) {
        while (k > 0 && !right.isEmpty()) {
            left.push(right.pop());
            k--;
        }
          return getLast10();
    }

    private String getLast10() {
        StringBuilder sb = new StringBuilder();

        int count = Math.min(10, left.size());

        for (int i = 0; i < count; i++) {
            sb.append(left.get(left.size() - 1 - i));
        }

        return sb.reverse().toString();
    }
}
