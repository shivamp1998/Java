package Java;

public class lcs {
    public static int lcsIter(String s, String t) {
		int n = s.length();
		int m = t.length();
		int dp[][] = new int [n+1][m+1];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				dp[i][j] = 0;
			}
		}
		if(s.charAt(n-1) == t.charAt(m-1) ) {
			dp[n-1][m-1] = 1;
		}else{
			dp[n-1][m-1] = 0;
		}
		for(int i=n-1; i>=0; i--) {
			for(int j=m-1; j>=0; j--) {
				if(s.charAt(i) == t.charAt(j)) {
					dp[i][j] = 1 + (dp[i+1][j+1]);
				}else{
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
	}
}
