package Java;
import java.util.*;
public class countMinReversals {
    public static int CountMinReversals(String input) {
        if(input.length() % 2 != 0) return -1;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == '{')
                st.push(input.charAt(i));
            else{
                if(st.isEmpty() || st.peek() != '{') {
                    st.push(input.charAt(i));
                }else{
                    st.pop();
                }
            }
        }
        int count = 0;
        while(!st.isEmpty()) {
            char a = st.pop();
            char b = st.pop();
            if(a != b) {
                count += 2;
            }else{
                count++;
            }
        }
        return count;
    }
}
