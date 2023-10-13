package Java;
public class printArraySubsets {
    public static int[][] helper(int input[], int si) {
		if(si == input.length) {
			return new int[1][0];
		}
		int[][] smOutput = helper(input, si + 1);
		int[][] output = new int [2 * smOutput.length ][];
		
		int k = 0;
		for(int i=0; i<smOutput.length; i++) {
			output[k] = new int [smOutput[i].length];
			for(int j=0; j<smOutput[k].length; j++) {
				output[k][j] = smOutput[i][j];
			}
			k++;
		} 
		for(int i=0; i<smOutput.length; i++) {
			output[k] = new int [smOutput[i].length + 1];
			output[k][0] = input[si];
			for(int j=1; j<=smOutput[i].length; j++){
				output[k][j] = smOutput[i][j-1]; 
			}
			k++;
		}
		
		return output;
	}
	public static int[][] subsets(int input[]) {
		// Write your code here
		return helper(input, 0);
	}
}
