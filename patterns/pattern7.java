package patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        int i, j;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("entyer the range: ");
        n = sc.nextInt();
        for(i=n; i>=1; i--) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
