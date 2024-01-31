package Java;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
public class PrintPath {
	
	public static ArrayList<Integer> printPath(int [][] mat, boolean [] visited, int current, int last) {
        if(current == last) {
            ArrayList<Integer> a = new ArrayList<>();
            a.add(current);
            return a;
        }
        visited[current] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<mat[current].length; i++) {
            if(mat[current][i] == 1 && !visited[i]) {
                ans = printPath(mat, visited, i, last);
				if(ans.size() > 0) {
					ans.add(current);
					break;
				}
            }
        }
        return ans;
    }
 
    public static void main(String[] args)  throws NumberFormatException, IOException{
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int mat[][] = new int[v][v];
        for(int i=0; i<e; i++) {
            int e1 = sc.nextInt();
            int e2 = sc.nextInt();
            mat[e1][e2] = 1;
            mat[e2][e1] = 1;
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        boolean visited[] = new boolean[v];
        ArrayList<Integer> ans = printPath(mat, visited, v1, v2);
        for(int x : ans) {
            System.out.print(x + " ");
        }
        sc.close();
	}
}