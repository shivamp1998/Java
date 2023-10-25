package Java;
public class minCount {
    public static int minimumCount(int n) {
        if(n <= 3) return n;
        int res = n;
        for(int i=1; i<=n; i++) {
            if(i*i > n) break;
            res = Math.min(res, 1 + minimumCount(n-i*i));
        }
        return res;
    }

    public static int minCountdp(int n) {
        int dp[] = new int [n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=1; i<=n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j]);
            }
            dp[i] = dp[i] + 1;
        }
        return dp[n];
    }
    public static void main(String...args) {

    }
}
