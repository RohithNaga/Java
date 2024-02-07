package patterns;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        int i, j;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        n = sc.nextInt();
        for(i = n; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
