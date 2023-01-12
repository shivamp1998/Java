package Java;

public class keypad {
    static String[] keywords = {"", "","abc","def","ghi","jlk","mno", "pqrs", "tuv", "wxyz"};
    public static String[] keyword(int n) {
        if(n == 0) {
            String[] str = {""};
            return str;
        }
        String[] smallOutput = keyword(n/10);
        String s = keywords[n%10];
        String[] output = new String [smallOutput.length * s.length()];
        int k = 0;
        for(int i=0; i<smallOutput.length; i++) {
            for(int j=0; j<output.length; j++) {
                output[k] = smallOutput[i] + s.charAt(j);
                k++;
            }
        }
        for(int i=0; i<output.length; i++) {
            System.out.println(output[i]);
        }
        return output;
    }
    public static void main(String ...args) {
        String[] ans = keyword(23);
    }
}
