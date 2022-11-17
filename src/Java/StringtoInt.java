package Java;
import java.lang.Math;
public class StringtoInt {
    public static int convertToInt(String number) {
        if(number.length() == 0) return 0;
        return (number.charAt(0) - '0')*(int)(Math.pow(10,number.length()-1)) + convertToInt(number.substring(1));
    }
    public static void main(String...args) {
        System.out.print(convertToInt("111"));
    }
}
