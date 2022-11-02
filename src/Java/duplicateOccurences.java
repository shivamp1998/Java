package Java;
public class duplicateOccurences {
    public static String removeDuplicates(String str) {
        int arr[] = new int [10000];

        for(int i=0; i<str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        String ans = "";
        for(int i=0; i<10000; i++) {
            if(arr[i] > 0) ans+=(char)(i);
        }
        return ans;
}
    public static void main(String ...args) {

    }
}
