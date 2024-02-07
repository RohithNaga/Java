package practisePrograms;
import java.util.Scanner;
public class lcm {
    static int findlcm(int a, int b) {
        int res = Math.max(a, b);

        while(true) {
            if(res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter the second number: ");
        int b = sc.nextInt();

        int lcmans = findlcm(a, b);
        System.out.println("the lcm of the 2 nums: " + lcmans);
    }
}
