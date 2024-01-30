package Java;

public class SplitArray {
    public static boolean splitArray(int[] input, int group1, int group2, int index) {
        if(input.length == index) {
            if(group1 == group2) return true;
            else return false;
        }
        if(input[index] % 3 == 0) {
            return splitArray(input, group1 + input[index], group2, index);
        }else if(input[index] % 5 == 0) {
            return splitArray(input, group1, group2 + input[index], index);
        }else {
            return splitArray(input, group1 + input[index] , group2, index) || splitArray(input, group1, group2 + input[index], index);
        }
    }
    public static boolean main(String...args) {
        int [] input = new int [10];
        return splitArray(input, 0, 0, 0);
    }       
}
