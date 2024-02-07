package practisePrograms;
import java.util.*;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        String rev = "";
        int len = str.length();
        int i;

        for(i=len-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.print("the reversed string is: " + rev);

        if(str.equals(rev)) {
            System.out.println("\nthe string is palindrome");
        } else {
            System.out.println("the string is not palindrome");
        }
    }
}
