package Java;
public class minPathdp {
    public static int minHelperMemo(int [][] input, int dp [][], int i, int j) {
		if(i >= input.length && j >= input[0].length) {
			return Integer.MIN_VALUE;
		}
		if(i == input.length - 1 && j == input[0].length - 1) {
			return input[i][j];
		}
		int ans1, ans2, ans3;
		if(dp[i+1][j] != Integer.MIN_VALUE) {
			ans1 =  dp[i+1][j];
		}else{
			ans1 = minHelperMemo(input, dp, i+1, j);
			dp[i+1][j] = ans1;
		}
		if(dp[i][j+1] != Integer.MIN_VALUE) {
			ans2 = dp[i][j+1];
		}else{
			ans2 = minHelperMemo(input, dp, i, j+1);
			dp[i][j+1] = ans2;
		}
		if(dp[i+1][j+1] != Integer.MIN_VALUE) {
			ans3 = dp[i+1][j+1];
		}else{
			ans3 = minHelperMemo(input, dp, i+1, j+1);
			dp[i+1][j+1] = ans3;
		}
		return input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
	}
	public static int minHelper(int [][] input, int i, int j) {
		if(input.length == 0) return Integer.MAX_VALUE;
		if(i>=input.length || j>=input[0].length) {
			return Integer.MAX_VALUE;
		}
		if(i == input.length -1  && j == input.length - 1) return input[i][j];
		return input[i][j] + Math.min(minHelper(input, i+1, j), Math.min(minHelper(input, i, j+1), minHelper(input, i+1, j+1))); 
	}
	public static int minCostPath(int[][] input) {
		//Your code goes here
		return minHelper(input, 0, 0);
	}
}
