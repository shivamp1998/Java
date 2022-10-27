package Java;
import java.util.Scanner;
import java.lang.Math;
public class maximizeNumber {
    
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i=10; i<=n*10 ;i*=10 ) {
             max = Math.max(max,(n/i) * (i/10) + (n%(i/10)));
        }
        System.out.println(max);
        sc.close();
    }
}
