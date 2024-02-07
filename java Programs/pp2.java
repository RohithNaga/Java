package practisePrograms;

///SWAP TWO NUMBERS

import java.util.*;
public class pp2 {
    public static void main(String[] args) {
        int a, b, temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        a = sc.nextInt();
        System.out.print("Enter the second integer: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("the value of a: " + a + " the value of b: " + b) ;
    }
}
