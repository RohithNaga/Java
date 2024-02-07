package practisePrograms;

import java.util.Arrays;
import java.util.Collections;

public class descendingsort {
    static int desSort(Integer[] arr) {
        int i, j;
        int temp;
        for(i=0; i<arr.length - 1; i++) {
            for(j=i+1; j< arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        return 1;
    }
    public static void main(String[] args) {
        Integer[]  arr1 = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        System.out.println("the original array: ");
        for(int ele: arr1) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.print("the sorted array: ");
        desSort(arr1);

        System.out.println("\ndescending order through methods: ");
        dessortmethod(arr1);
    }
    static int dessortmethod(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println( Arrays.toString(arr));
        return 1;
    }
}
