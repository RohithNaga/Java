package patterns;
//diamond pattern
import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();

        for(i=1; i<=n; i++) {
            for(k=1; k<=n-i; k++) {  /// k is for the spaces
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++) {  // j is for the stars printing in the rows(odd number)
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1; i>=1; i--) {  // the pattern for the down parts starts here
            // by taking n-1 to notv get the large line again.
            for(k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
