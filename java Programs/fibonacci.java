package practisePrograms;

import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3, i;
        int count;
        System.out.println("enter total numbers that should be printed: ");
        count = sc.nextInt();
        System.out.println(n1 + " " + n2);
        for(i = 3; i <= count; i++) {
            ///starts from 3 because there are already 2 values printed which are 0 and 1.
            n3 = n1 + n2;
            System.out.println(n3 + " ");
            n1 = n2;
            n2 = n3;

        }
    }
}
