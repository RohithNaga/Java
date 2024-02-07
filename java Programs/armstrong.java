package practisePrograms;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range: ");
        int range = sc.nextInt();
        int i;
        System.out.println("the armstrong numbers upto the range " + range + " is: ");
        for(i = 10; i <= range; i++) {  ///here i starts from 10 because the values below 10 comes under the armstrong number

            if(checkarmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean checkarmstrong(int n) {
        int r, cube;
        int sum = 0;
        int temp = n;

        while(n > 0) {
            r = n % 10;
            cube = r * r * r;
            sum = sum + cube;
            n = n / 10;

        }
        return temp == sum;
    }
}
