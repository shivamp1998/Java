package Java;
import java.util.Scanner;

public class Dijkstra {

	public static int findMin(boolean [] visited, int [] distance) {
		int minIndex = -1;
		for( int i=0; i<visited.length; i++) {
			if(!visited[i] && (minIndex == -1 || distance[i] < distance[minIndex])) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int graph[][] = new int[V][V];
		for(int i=0; i<E; i++) {
			int e1 = s.nextInt();
			int e2 = s.nextInt();
			int w = s.nextInt();
			graph[e1][e2] = w;
			graph[e2][e1] = w;
		}

		boolean visited[] = new boolean [V];
		int distance[] = new int[V];
		for(int i=0; i<V; i++) distance[i] = Integer.MAX_VALUE;
		distance[0] = 0;

		for(int i=0; i<V; i++) {
			int v = findMin(visited, distance);
			visited[v] = true;
			for(int j=0; j<V; j++) {
				if(!visited[j] && graph[v][j] > 0) {
					if(distance[j] > (distance[v] + graph[v][j])) {
						distance[j] = distance[v] + graph[v][j];
					}
				}
			}
		}

		for(int i=0; i<V; i++) {
			System.out.println(i + " " + distance[i]);
		}

        s.close();
	}
}