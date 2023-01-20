package Java;
import java.util.*;

public class fibonnaciDp {
    public static int fibonnaci(int []dp, int n) {
        if(n == 0 || n == 1) return n;
        int ans1 = 0,  ans2 = 0;
        if(dp[n-1] == -1){
            ans1 = fibonnaci(dp, n-1);
            dp[n-1] = ans1;
        }else{
            ans1 = dp[n-1];
        }
        if(dp[n-2] == -1) {
            ans2 = fibonnaci(dp, n-2);
            dp[n-2] = ans2;
        }else{
            ans2 = dp[n-2];
        }
        return ans1 + ans2;
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int [n+1];
        for(int i=0; i<=n; i++) dp[i] = -1;
        System.out.print(fibonnaci(dp, n));
        
    }    
}
