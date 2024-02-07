package patterns;
import java.util.*;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        int i, j;
        int n;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rangee: ");
        n = sc.nextInt();
        for(i=1; i<=n; i++) {
            for(j=1; j<=i; j++) {
                sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
