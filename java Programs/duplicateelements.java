package practisePrograms;

public class duplicateelements {
    static int dupliacteele(int[] arr) {
        int i;
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for(i=0; i<n-1; i++) { //only goes upto the last before element because after last there is no ele to compare the value
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1]; //store the last element whether it is unique or repeated

        for(i=0; i<n; i++) {
            arr[i] = temp[i];
        }

        return j;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 7};
        int length = dupliacteele(arr1);
        System.out.println("the array after removing duplictes: ");
        for(int i=0; i<length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
