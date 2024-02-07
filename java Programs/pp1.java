package practisePrograms;

///MULTIPLY TWO FLOAT NUMBERS
import java.util.*;

public class pp1 {
    public static void main(String[] args) {
        float x, y;
        float mul;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        x = sc.nextFloat();
        System.out.print("Enter the second number: ");
        y = sc.nextFloat();
        mul = x * y;
        System.out.println("the multiplication of the two numbers is: " + mul);

    }
}
