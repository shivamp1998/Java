package Java;

public class staircase {
    public static int findStaircase(int n) {
        if(n <= 2) return n;
		if(n == 3) return 4;
		int[] dp = new int [n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i=4; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
    }
}
