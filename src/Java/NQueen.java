package Java;
public class NQueen {
    public static boolean isSafe(int row, int col, int [][] ans, int n) {
		for(int i=0; i<row; i++) {
			if(ans[i][col] == 1) return false;
		}
		for(int i=row, j=col; i >= 0 && j < n; i--, j++) {
			if(ans[i][j] == 1) return false;
		}
		for(int i = row, j = col; i>=0 && j>=0; i--,j--) {
			if(ans[i][j] == 1) return false;
		}
		return true;
	}
	public static void helper(int n,int row, int[][]ans )	{
		if(row == n) {
			for(int i=0; i<ans.length; i++) {
				for(int j=0; j<ans[i].length; j++) {
					System.out.print(ans[i][j] + " ");
				}
			}
			System.out.println();
		}
		for(int i=0; i<n; i++) {
			if(isSafe(row,i , ans, n)) {
				ans[row][i] = 1;
				helper(n, row+1, ans);
				ans[row][i] = 0;
			}
		}
	}
	public static void placeNQueens(int n){
			helper(n, 0, new int [n][n]);
	}
}
