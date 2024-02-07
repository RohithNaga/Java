package practisePrograms;
import java.util.*;
public class substringComparision {
    public static String substringcomp(String s, int k) {
        String str = s.substring(0, k);  //actually takes first k elements as the string str.
        String small = str;
        String large = str;

        for(int i=1; i<=s.length() - k; i++) {
            str = s.substring(i, i+k);

            if(str.compareTo(small) < 0) {
                small = str;
            }
            if(str.compareTo(large) > 0) {
                large = str;
            }
        }
        return small + "\n" + large;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string and key: ");
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(substringcomp(s, 3));
    }
}
