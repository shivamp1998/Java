package Java;
public class ratMaze {
    public static boolean helper(int maze[][], int i, int j, int [][] visited) {
		if(i < 0 || i >= maze.length || j < 0 || j >= maze[i].length || maze[i][j] == 0 || visited[i][j] == 1) {
			return false;
		};
		visited[i][j] = 1;
		if(i == maze.length - 1 && j == maze[i].length - 1) {
			return true;
		};
		return helper(maze, i+1, j, visited) || helper(maze, i-1, j, visited) || helper(maze, i, j+1, visited) || helper(maze, i, j-1, visited);
	}
	public static boolean ratInAMaze(int maze[][]){
		int [][] visited = new int[maze.length][maze.length];
		return helper(maze, 0 , 0, visited);

	}
}
