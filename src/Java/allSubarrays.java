package Java;

public class allSubarrays {
    public static int[][] helper(int input[], int k, int index) {
		if(index == input.length -1) {
            int arr[][] = {{}};
			return arr;
		}
        int num = input[index];
        int ans[][] = {{}};
        System.out.println(ans);
        return ans;
    }
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return helper(input,k,0);   
	}
    public static void main(String...args) {

    }    
}
