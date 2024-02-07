package patterns;
//REVERSE PYRAMID
import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        int n = sc.nextInt();

        for(i=n; i>=1; i--) {
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
