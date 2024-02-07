package patterns;
import java.util.*;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();
        int i, j, k;
        for(i=n; i>=1; i--) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
