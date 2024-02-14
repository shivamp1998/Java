package Java;

public class DetectGraphLoop {

    boolean dfs(String[] board,int startX, int startY, int i, int j, boolean [][] visited, int count) {
		int[] X_Dir = {-1,1,0,0,1,-1,1,-1 };
		int[] Y_Dir = {0,0,-1,1,1,-1,-1,1 };
		visited[i][j] = true;
		
		if(startX == -1) startX = i;
		if(startY == -1) startY = j;
		// System.out.println(startX + "" + startY + " " + i + "" + j + " " + count +" " +  board[i].charAt(j));
		boolean ans = false;
		for(int k=0; k<X_Dir.length; k++) {
			int x = i + X_Dir[k];
			int y = j + Y_Dir[k];

			if(startX == x && startY == y) {
				if(count >= 4) return true;
			}
			
			if(x >= 0 && y >=0 && x < board.length && y < board[x].length() && board[x].charAt(y) == board[i].charAt(j) && !visited[x][y]) {
				ans = ans || dfs(board, startX, startY, x, y, visited, count + 1);
			}
		}
		visited[i][j] = false;
		return ans;
	} 
	int solve(String[] board , int n, int m)
	{
		boolean visited[][] = new boolean[n][m];
		boolean ans = false;
		for(int i=0; i<n; i++) 	{
			for(int j=0; j<m; j++) {
				if(!visited[i][j]) {
					ans = ans || dfs(board, -1, -1, i, j, visited, 0);
				}
			}
		}
		return ans ? 1 : 0;
	}

	
	
}