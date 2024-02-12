package Java;

public class MatchString {
	
	boolean dfs(String graph[],  int i, int j, boolean visited[][], String str) {
		int[] xArr = {-1,1,0,0,1,-1,1,-1 };
		int[] yArr = {0,0,-1,1,1,-1,-1,1 };
		if(str.length() == 0) {
			return true;
		}
		visited[i][j] = true;
		boolean ans = false;
		for(int p=0; p<xArr.length; p++) {
			int x =i + xArr[p];
			int y =j +  yArr[p];
			if(x >= 0  && y >=0 && x <graph.length && y < graph[x].length() && !visited[x][y] && graph[x].charAt(y) == str.charAt(0)) {
				ans = dfs(graph, x, y, visited, str.substring(1));
				if(ans) return ans;
			}
		}
		visited[i][j] = false;
		return false;
		
	}
	int solve(String[] Graph , int N, int M)
	{

		
		String str = "CODINGNINJA";
		boolean visited[][] = new boolean[N][M];
		for(int i=0; i<N; i++) {
			visited[i] = new boolean[M];
		}
		boolean ans = false;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(Graph[i].charAt(j) ==  'C') {
					ans = ans || dfs(Graph, i, j, visited, str.substring(1));
				}
			}
		}
		return ans == true ? 1 : 0;


	}
	
	
}