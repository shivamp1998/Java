package Java;
import java.util.Scanner;
public class TrianglePatter {
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=n-i-1; j<n; j++) {
                System.out.print("*");
            }
            for(int j=i-1; j>=0; j--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
    }
}
