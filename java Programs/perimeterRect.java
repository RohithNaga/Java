package practisePrograms;
import java.util.*;

public class perimeterRect {
    static int perimeter(int l, int b) {
        int peri = 2 * (l + b);
        return peri;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int len, wid;
        System.out.println("enter the length of the rectangle: ");
        len = sc.nextInt();
        System.out.println("enter the breadth of the rectangle: ");
        wid = sc.nextInt();

        int perimeterofrect = perimeter(len, wid);
        System.out.println("the perimeter of the rectangle is: " + perimeterofrect);

    }
}
