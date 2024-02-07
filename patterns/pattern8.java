package patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        int i, j;
        int n;
        int num = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        n = sc.nextInt();
        for (i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
}
