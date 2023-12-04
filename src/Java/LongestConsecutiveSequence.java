package Java;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		//iska worst o(n) hai but average ~o(1) ho skta hai, solution me visited array use kiya hai
		//jisse complexity =o(1) ho jayegi
		HashMap<Integer,Integer> m = new HashMap<>();
		int start = -1, end = -1, max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(!m.containsKey(arr[i])) {
				m.put(arr[i], 1);
			}
		}
		for(int i=0; i<arr.length; i++) {
			int j = arr[i];
			int count = 0;
			while(m.containsKey(j)) {
				count++;
				j++;
			}
			if(count > max) {
				max = count;
				start = arr[i];
				end = j-1;
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(start);
		ans.add(end);
		return ans;
    }
}
