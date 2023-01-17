package Java;
import java.util.*;
public class multiply {
    public static int multiple(int n, int start) {
        if(n == 1) return 1;
        int temp = n;
        int res = 1;
        while ( temp > 0) {
            res *= ++start;
            temp--;
        }
        return res + multiple(n-1, start);
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(multiple(n, 1));
    }
}
