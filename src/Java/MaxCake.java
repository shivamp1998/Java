package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxCake {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void helper(boolean [][] graph, boolean[][] visited, int[][] map, int i, int j) {
		visited[i][j] = true;
		int[] x_dir = {-1,1,0,0,1,-1,1,-1 };
		int[] y_dir = {0,0,-1,1,1,-1,-1,1 };
		
		for(int k=0; i<x_dir.length; k++) {
			int x = i + x_dir[k];
			int y = j + y_dir[k];
			if(visited[x][y]) {
				map[x][y] = map[x][y] + 1;
			}
			if(x >=0 && y >=0 && x < graph.length && y < graph[x].length && !visited[x][y]) {
				helper(graph, visited, map, x, y);
			}
		}
	} 
	public static int solve(boolean[][] graph, int n) {
		boolean visited[][] = new boolean[n][n];
		int map[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j])
				helper(graph, visited, map, i, j);
			}
		}
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] >= 2) count++;
			}
		}
		return count / 3;
	}

	public static boolean[][] takeInput() throws IOException {
		String[] strNums;
		strNums = br.readLine().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int m = Integer.parseInt(strNums[1]);

		boolean[][] graphs = new boolean[n][n];
		int firstvertex, secondvertex;

		for (int i = 0; i < m; i++) {
			String[] strNums1;
			strNums1 = br.readLine().split("\\s");
			firstvertex = Integer.parseInt(strNums1[0]);
			secondvertex = Integer.parseInt(strNums1[1]);
			graphs[firstvertex][secondvertex] = true;
			graphs[secondvertex][firstvertex] = true;
		}
		return graphs;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] graphs = takeInput();

		int ans = solve(graphs, graphs.length);
		System.out.println(ans);

	}
}