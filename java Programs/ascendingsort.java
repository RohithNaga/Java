package practisePrograms;

import java.util.Arrays;

public class ascendingsort {
    static int ascSort(int[] arr) {
        int i, j;
        int temp = 0;
        for(i=0; i<arr.length - 1; i++) {
            for(j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
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
        int[] arr1 = {2, 4, 8, 9, 6, 5,1, 7, 3};
        System.out.println("Original array: ");
        for(int ele: arr1) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("the sorted array: ");
        ascSort(arr1);

        System.out.println("\nsorting using the methods: ");
        sorttechnique(arr1);

    }
    static int sorttechnique(int[] arr) {
        Arrays.sort(arr);
        for(int ele: arr) {
            System.out.print(ele + " ");
        }
        return 1;

    }
}
