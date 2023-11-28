package Java;

public class knapsack {
    public static int helper(int[] weights, int[] values, int n, int maxWeight, int i) {
		if(i >= n) return 0;
		if(weights[i] > maxWeight) {
			return helper(weights, values, n, maxWeight, i+1);
		}
		else{
			int a1 = values[i] + helper(weights, values, n, maxWeight - weights[i], i + 1);
			int a2 = helper(weights, values, n, maxWeight, i+1);
			return Math.max(a1, a2);
		}
	}

    public static int knapsackIterative(int wt[], int v[], int n, int w, int i) {
        int dp[][] = new int [n+1][w+1];
        
        for(int j=n-1; j>=0; j--) {
            int ans;
            for(int k=0; k<=w;k++) {
                if(wt[k] <= w) {
                    int a1 = v[k] + dp[j+1][k - wt[j]];
                    int a2 = dp[j+1][k];
                    ans = Math.max(a1, a2);
                }else{
                    ans = dp[j+1][k];
                }
                dp[j][k] = ans;
            }
        }
        return dp[0][w];
    }

	public static int knapsackCalc(int[] weights, int[] values, int n, int maxWeight) {
		return helper(weights, values, n, maxWeight, 0);
	}
}
