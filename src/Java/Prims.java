package Java;
import java.util.Scanner;

public class Prims {

	public static int findMin(int V, int weight[], boolean visited[]) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i=0; i < V; i++) {
			if(!visited[i] && min > weight[i]) {
				min = weight[i];
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int [][] graph = new int [V][V];
		for(int i=0; i<E; i++) {
			int e1 = s.nextInt();
			int e2 = s.nextInt();
			int w = s.nextInt();
			graph[e1][e2] = w;
			graph[e2][e1] = w;
		}

		int parent[] = new int [V];
		int weight[] = new int [V];
		for(int i=0; i<V; i++) {
			parent[i] = -1;
			weight[i] = Integer.MAX_VALUE;
		}
		weight[0] = 0;
		boolean visited[] = new boolean[V];
		for(int i=0; i<V; i++) {
			int p = findMin(V, weight, visited);
			visited[p] = true;
			for(int j=0; j<V; j++) {
				if(!visited[j] && graph[p][j] > 0) {
					if(weight[j] > graph[p][j]) {
						weight[j] = graph[p][j];
						parent[j] = p;
					}
				}
			}
		}

		for(int i=1; i<V; i++) {
			if(parent[i] < i) {
				System.out.println(parent[i] + " " + i + " " + weight[i]);
			}else{
				System.out.println(i + " " + parent[i]  + " " + weight[i]);
			}
		}
        s.close();
	}
}