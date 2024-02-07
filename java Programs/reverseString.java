package practisePrograms;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        int i;
        String rev = "";
        for(i=len-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("the reverse string is: ");
        System.out.println(rev);
    }
}
