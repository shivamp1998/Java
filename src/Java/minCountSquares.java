package Java;
import java.util.Scanner;

public class minCountSquares {
    public static int minSquare(int n, int dp[]) {
        if(n == 0 ) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i=1; i*i <= n; i++) {
            if(dp[n - (i*i)] != -1) {
                dp[n - (i*i)] = minSquare(n, dp);
            }
            ans = Math.min(ans, dp[n - (i*i)]);
        }
        return ans;
    }

    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int [n+1];
        for(int i=0; i<dp.length; i++) dp[i] = -1;
        System.out.print(minSquare(n, dp));
        sc.close();
    }
}
