package patterns;
import java.util.*;

public class pattern10 {
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
    }
}
