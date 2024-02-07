package patterns;
import java.util.*;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();
        int i, j, k;
        for(i=n; i>=1; i--) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
