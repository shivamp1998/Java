package Java;
import java.util.Scanner;
public class calculateNcr {
    static int nCr(int n,int r) {
        if(n == r || r == 0) return 1;
        if( r == 1 ) return n;
        else return nCr(n-1,r) + nCr(n-1,r-1);
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nCr(n,r));
        sc.close();
    }
 }
