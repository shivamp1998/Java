package Java;

import java.util.*;

public class pairSum {
	public static int PairSum(int[] input, int size) {
		int count = 0;
		HashMap<Integer, Integer> m = new HashMap();
		for (int i = 0; i < input.length; i++) {
			if (m.containsKey(input[i])) {
				m.put(input[i], m.get(input[i]) + 1);
			} else {
				m.put(input[i], 1);
			}
		}

		for (int x : m.keySet()) {
			if (x != 0 && m.containsKey(-x)) {
				count += m.get(x) * m.get(-x);
			}
		}
		int ans = count / 2;
		if (m.containsKey(0)) {
			int n = m.get(0);
			ans += n * (n - 1) / 2;
		}

		return ans;
	}
}
