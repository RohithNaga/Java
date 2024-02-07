package practisePrograms;
import java.util.*;

public class abc {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        // Adding elements to the ArrayList
        li.add(123);
        li.add(435);
        li.add(876);
        li.add(111);

        // Reversing the ArrayList
        Collections.reverse(li);

        // Printing elements in the ArrayList using a for-each loop
        for (int ele : li) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
