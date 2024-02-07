package practisePrograms;

import java.util.Scanner;

public class StringToken {
    public static void tokenize(String s) {
        String[] tokens = s.split(" ");
        int tokennumber = tokens.length;
        if(s.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println("the length of the tokens: " + tokennumber);
            for(String token: tokens) {
                System.out.println(token);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();   /// trim removes white spaces.
        tokenize(s);
    }
}
