package Java;
import java.util.Scanner;

public class printAllSubsequences {
    public static void printSubsquences(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        printSubsquences(str.substring(1), ans);
        printSubsquences(str.substring(1), ans + str.charAt(0));
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubsquences(str, "");
        sc.close();        

    }   
}
