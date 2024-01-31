package Java;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class PrintPathBFS {

    public static ArrayList<Integer> printPath(int mat[][], boolean [] visited, int start, int end) {
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        q.add(start);
        m.put(start,-1);
        visited[start] = true;
        while(!q.isEmpty()) {
            int current = q.poll();
            for(int i=0; i<mat[current].length; i++) {
                if(mat[current][i] == 1 && !visited[current]) {
                    m.put(i, current);
                    if(i == end) {
                       int init = m.get(i);
                        arr.add(i);
                        while(i != -1) {
                            i = init;
                            init = m.get(i);
                            arr.add(init);
                        }

                    }
                }
            }
        }
        return arr;   
    }
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int mat[][] = new int [v][v];
        for(int i=0; i<e; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            mat[x1][x2] = 1;
            mat[x2][x1] = 1;
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        for(int x  : printPath(mat, new boolean [v], v1, v2)) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}
