package practisePrograms;
import java.util.*;
public class linearsearch {
    static int findsearch(int[] arr, int key) {
        int i;
        for(i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        for(int ele: arr1) {
            System.out.println(ele);
        }
        System.out.print("enter the key value to search: ");
        int key = sc.nextInt();
        int res = findsearch(arr1, key);
        if(res == -1) {
            System.out.println("the element is not in the array.");
        }
        else {
            System.out.println(key + " is present at the position of: " + res);
        }
    }
}
