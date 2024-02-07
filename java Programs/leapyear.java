package practisePrograms;
import java.util.*;

public class leapyear {
    static boolean isleapyear(int y) {
        return (y % 4 == 0) && (y % 100 != 0 || y % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year: ");
        int y = sc.nextInt();

        if(isleapyear(y)) {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y  + " is not a leap year");
        }
    }
}
