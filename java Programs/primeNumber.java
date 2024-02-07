package practisePrograms;

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the range: ");
        n = sc.nextInt();

        System.out.println("the prime numbers are: ");
        for(i = 2; i<= n; i++) {
            int count = 0;
            for(j = 2; j < i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.println(i);
            }
        }
    }
}