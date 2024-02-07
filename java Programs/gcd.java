package practisePrograms;

import java.util.*;
public class gcd {
    static int findgcd(int a, int b) {
        int min = 0;
        if (a<b) {
            min = a;
        }
        else{
            min = b;
        }
        for(int i = min; i>=1; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;

            }
        }
        return 0;
    }
    static int euclidgcd(int a, int b) {
        //euclid gcd tells tht
        //find the large num and replace it with the diff of both nums
        //repeat the process untill the both values gets the same
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else{
                b = b - a;
            }
        }
        return a; //at final both values will be equal
    }

    static int euclidgcd2(int a, int b) {
        //this is more optimized than the previous algo
        //iin this we replace the greatest num with the divide of the two nums
        //until any of the number equals to the zero
        //so the other num is the gcd

        while(a != 0 && b != 0) {
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a != 0) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdans = euclidgcd2(a, b);
        System.out.println("the gcd of the two nums is: " + gcdans);
    }
}