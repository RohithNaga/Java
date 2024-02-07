package practisePrograms;
import java.util.*;
/*public class factorial {
    public static void main(String[] args) {
        int num;
        int i;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        num = sc.nextInt();

        for(i = num; i>=1; i--) {
            fact = fact * i;
        }
        System.out.println("the factorial of the given number is: " + fact);
    }
} */

//using method
public class factorial {
    static int facto(int a) {
        int fact = 1;
        for(int i = a; i>=1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number: ");
        int num;
        num = sc.nextInt();
        System.out.println("the factorial of the " + num + " is: " + facto(num));
    }
}
