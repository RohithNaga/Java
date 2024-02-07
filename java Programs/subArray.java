package practisePrograms;

public class subArray {
    static void finsubarray(int[] arr) {
        int i, j, k;
        int len = arr.length;
        for(i=0; i<len; i++) {
            for(j=i; j<len; j++) {
                for(k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("the array: ");
        for(int ele : arr1) {
            System.out.print(ele + " ");
        }
        System.out.println("\nthe sub Arrays are: ");
        finsubarray(arr1);
    }
}
