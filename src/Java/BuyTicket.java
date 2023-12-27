public class BuyTicket {
    public static int buyTicket(int input[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int x: input) {
			pq.add(x);
		}
		int time = 0, arrSize = input.length;
		int p = 0;
		while(!pq.isEmpty()) {
			int top = pq.peek();
			if(top == input[p]) {
				time++;
				if(p == k) return time;
				input[p] = Integer.MIN_VALUE;
				pq.poll();
			}
			p = (++p) % arrSize;
		}
		return 0;
	}
}
