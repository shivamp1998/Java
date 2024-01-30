package Java;
import java.io.IOException;
import java.util.Scanner;
public class HasPath {

    public static boolean hasPath(int [][] mat,boolean[] visited,int current, int path ) {
        if(current == path) return true;
        visited[current] = true;
        boolean flag = false;
        for(int i=0; i<mat[current].length; i++) {
            if(mat[current][i] == 1 && !visited[i]) {
                flag = flag || hasPath(mat, visited, i, path);
            }
        }
        return flag;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
            int v1, v2,v,e;
            Scanner sc = new Scanner(System.in);
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            v = sc.nextInt();
            e = sc.nextInt();
            int[][] mat = new int[v][v];
            for(int i=0; i<e; i++) {
                int e1 = sc.nextInt();
                int e2 = sc.nextInt();
                mat[e1][e2] = 1;
                mat[e2][e1] = 1;
            }
            boolean visited[] = new boolean[v];
            System.out.println(hasPath(mat, visited, v1,v2));
            sc.close();

	}

}