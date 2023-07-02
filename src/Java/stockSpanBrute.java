package Java;
import java.util.*;
public class stockSpanBrute {
	public static int[] stockSpan(int[] price) {
		// Your code goes here
		int[] span = new int[price.length];
		for (int i = 0; i < price.length; i++) {
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if (price[i] > price[j]) {
					count++;
				} else {
					span[i] = count;
					break;
				}
			}
			span[i] = count;
		}
		return span;
	}

	public static int[] stockSpanStack(int[] price) {
		int span[] = new int[price.length];
		Stack<Integer> st = new Stack<>();
		for (int i=0; i<price.length; i++) {
			while(!st.isEmpty() && price[st.peek()] < price[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				span[i] = i+1;
			}else{
				span[i] = i - st.peek();
			}
		}
		return span;
	}

}
