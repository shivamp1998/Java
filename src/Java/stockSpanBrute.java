package Java;

public class stockSpanBrute {
    	public static int[] stockSpan(int[] price) {
		//Your code goes here
		int [] span = new int [price.length];
		for(int i=0; i<price.length; i++) {
			int count = 1;
			for(int j=i-1; j>=0; j--) {
				if(price[i] > price[j]) {
					count++;
				}else{ span[i] = count; break;}
			}
			span[i] = count;
		}
		return span;
	}
}
