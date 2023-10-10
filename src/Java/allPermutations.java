package Java;

public class allPermutations {
    public static void permutationsHelper(String input, String str, int n) {
        if(n == str.length()) {
            System.out.println(str);
            return;
        }
        for(int i=0; i<input.length(); i++) {
            permutationsHelper(input.substring(0, i) + input.substring(i+1), str + input.charAt(i), n);
        }
    }
    public static void permutations(String str) {
        permutationsHelper(str, "", str.length());;
    }
    public static void main(String...args) {
        String s = "abc";
        permutations(s);
    }
}
