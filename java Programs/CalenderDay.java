package practisePrograms;

import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenderDay {

    public static String findday(int dd, int mm, int yy) {

        LocalDate dt = LocalDate.of(yy, mm, dd);
        DayOfWeek dayweek = dt.getDayOfWeek();
        return dayweek.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        String res = findday(day, month, year);
        System.out.println("The day of the particular date is: " + res);

    }
}
