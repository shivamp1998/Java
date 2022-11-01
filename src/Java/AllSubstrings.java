package Java;

public class AllSubstrings {
    public static void substr(String str) {
        for(int j=0; j<str.length(); j++) {
            for(int i=j; i<str.length(); i++) {
                System.out.print(str.substring(j, i) + " ");
            }
        }
    }

    public static void main(String ...args) {
        substr("shivam");
    } 
}
