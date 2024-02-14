package Java;
public class MaxCake {
	
    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static int cakeHelper(String[] edge,boolean [][] visited, int i, int j) {
		visited[i][j] = true;
		int[] x_dir = {0, 1, -1, 0 };
		int[] y_dir = {1, 0, 0, -1};
		int maxCount = 0;
		for(int k=0; k<x_dir.length; k++ ) {
			int x = i + x_dir[k];
			int y = j + y_dir[k];
			if(x >= 0 && y >=0 && x < edge.length &&  y < edge[x].length() &&  edge[x].charAt(y) == '1' && !visited[x][y]) {
				maxCount = maxCount + cakeHelper(edge, visited, x, y);
			}
		}
		return maxCount + 1;
	} 
	public static int dfs(String[] edge, int n) {
        boolean visited[][] = new boolean[n][n];
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(edge[i].charAt(j) == '1') {
                    count = Math.max(count, cakeHelper(edge, visited, i, j));
                }
            }
        }
        return count;
	}
}