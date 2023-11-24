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
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		return helper(weights, values, n, maxWeight, 0);
	}
}
