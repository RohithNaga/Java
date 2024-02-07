package practisePrograms;
import java.util.*;

///GREATEST NUMBER AMONG THREE NUMBERS\
/* public class pp4 {
    static int biggestthree(int x, int y, int z) {
        if(x > y && x > z) {
            return x;
        }
        else if(y > x && y > z) {
            return y;
        }
        else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("enter the first integer: ");
        a = sc.nextInt();
        System.out.print("enter the second integer: ");
        b = sc.nextInt();
        System.out.print("enter the three integer: ");
        c = sc.nextInt();

        int largest = biggestthree(a, b, c);
        System.out.println(largest + " is the largest ampong the three");
    }
} */

///USING TERINARY OPERATORS
public class pp4 {

    static int biggestThree(int x, int y, int z) {
        //terniary operator -> (conditional expression) ? execute if true : execute if false
        //largest  = 3>(5>10 ? 5:10) ? 3: ((5>10) ? 5:10);
        //largest  = 3>10 ? 3 : 10
        //largest  = 10
        //if the condition is true execute the statement before the semi colon
        //if the condition is false then execute the after semi colon part
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("enter the first integer: ");
        a = sc.nextInt();
        System.out.print("enter the second integer: ");
        b = sc.nextInt();
        System.out.print("enter the three integer: ");
        c = sc.nextInt();

        int large = biggestThree(a, b, c);
        System.out.println(large + " is the largest integer");
    }
}
