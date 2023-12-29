package Java;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargest {
    public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(input[i]);
		}
		for(int i=k; i<input.length; i++) {
			int min = pq.peek();
			if(min < input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int x: pq) {
			list.add(x);
		}
		return list;
		
	}
}
