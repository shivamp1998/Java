package Java;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
class test {
	public static void checkConsonant(String s) {
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
		} 

	}
    public static String[] subsequences(String s) {
		if(s.length() == 0 ) {
			String[] str = {""};
			return str;
		}
		String[] smOutput = subsequences(s.substring(1));
		String output[] = new String [smOutput.length * 2];
		for(int i=0; i<smOutput.length; i++) {
			output[i] = smOutput[i];
		}
		for(int i=0; i<smOutput.length; i++) {
			output[i + smOutput.length] = s.charAt(0) + smOutput[i];
		}

		return output;

	}
	public static String[] keypad(int n){
		// Write your code here
		String ans[] = subsequences("abc");
		return ans;
	}
    public static void main(String ...args) {
        String[] ans = keypad(10);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    } 
}