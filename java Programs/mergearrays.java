package practisePrograms;

public class mergearrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int a = arr1.length;
        System.out.println("first array: ");
        for(int ele: arr1) {
            System.out.print(ele + " ");
        }

        System.out.println();
        int[] arr2 = {7, 8, 9, 0};
        int b = arr2.length;
        System.out.println("second array: ");
        for(int ele: arr2) {
            System.out.print(ele + " ");
        }
        int c = a + b;
        int[] arr3 = new int[c];

        for(int i=0; i<a; i++) {
            arr3[i] = arr1[i];
        }
        for(int i=0; i<b; i++) {
            arr3[a + i] = arr2[i];
        }

        System.out.println("\nthe merged array: ");
        for (int i=0; i<c; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
