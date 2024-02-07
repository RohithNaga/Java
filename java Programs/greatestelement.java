package practisePrograms;

public class greatestelement {
    static int findgreatest(int[] arr) {
        int max = arr[0];
        int i;
        for(i=0; i<arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 24, 345, 567, 244, 758 ,967, 879, 456,};
        int result = findgreatest(arr1);
        System.out.println("the largest of the array is: " + result);
    }
}
