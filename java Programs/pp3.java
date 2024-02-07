package practisePrograms;

import java.util.*;
import java.io.*;

//CHECK WHETHER A GIVEN NUMBER IS ODD OR EVEN

public class pp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Enter the number: ");
        x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("the given number " + x + " is even number");
        }
        else{
            System.out.println("the given number " + x + " is odd number");
        }
    }
}
