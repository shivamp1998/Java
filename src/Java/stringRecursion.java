package Java;

public class stringRecursion {
    public static String recur(String input) {
        if(input.length() == 0) return input;
        String s = recur(input.substring(1, input.length()));
        if(input.charAt(0) == 'x') return s;
        else return s + input.charAt(0);
    }
    public static void main(String...args) {
        System.out.print(recur("pxxp"));
    }   
}
