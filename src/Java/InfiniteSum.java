package Java;
import java.util.*;

public class InfiniteSum {
    public static double infiniteSum(int n) {
        if(n == 0) return 1;
        return 1 / Math.pow(2, n)  + infiniteSum(n-1)
    } 
    public static void main(String...args) {
        double ans = infiniteSum(2);
        System.out.println(ans);
    }   
}
