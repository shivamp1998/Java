package Java;

public class AllSubstrings {
    public static void substr(String str) {
        for(int j=0; j<str.length(); j++) {
            for(int i=j; i<str.length(); i++) {
                System.out.print(str.substring(j, i) + " ");
            }
        }
    }

    public static void printSubstrings(String str) {
        int n = str.length();
        for(int i=1; i<=n; i++) {
            for(int j=0;j<=n-i; j++) {
                System.out.print(str.substring(i, j+n) + " ");
            }
        }
    }

    public static void main(String ...args) {
        substr("shivam");
        // printSubstrings("shivam");
    } 
}
