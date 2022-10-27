package Java;
import java.util.Scanner;
import java.lang.Math;
public class AddTwoNumbers {
	
	public static int totalSalary(int basic, char grade) {
        double hra = basic * 20.0 / 100;
        double da = basic * 50.0 / 100;
        double pf = basic * 11.0 / 100;
        double salary = hra + da - pf + basic;
        if(grade == 'A') {
            salary += 1700;
		}else if(grade == 'B') {
            salary += 1500;
        }else{
            salary += 1300;
        }
        return (int)Math.round(salary);
    }
	
    public static void main(String[] args) {
		// Write your code here
        
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
		int total = totalSalary(basic,grade);
        System.out.println(total);
        sc.close();
	}
}
