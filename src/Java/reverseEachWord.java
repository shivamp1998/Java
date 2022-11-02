package Java;

public class reverseEachWord {
    public static String reverseWord(String str) {
        String rev = "";
        for(int i=0; i<str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        return rev;
    }

    public static String reverseAllWords(String str) {
        String rev = "";
        int spaceIndex = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ' ') {
                rev += reverseWord(str.substring(spaceIndex, i))+" ";
                spaceIndex = i+1;
            }
        }
        rev += reverseWord(str.substring(spaceIndex, str.length()));
        return rev;
	}    
    public static void main(String ...args) {

        System.out.print(reverseAllWords("Hi this is shivam"));
        
    }

}


