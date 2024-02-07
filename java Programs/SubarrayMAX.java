package practisePrograms;

public class SubarrayMAX {
    static int maxsubarray(int[] arr) {
        int i, j;
        int sum = 0;
        int maxsum  = 0;
        for(i=0; i<arr.length; i++) {
            sum = 0;
            for(j=i; j<arr.length; j++) {
                sum = sum + arr[j];
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
    static int kadanesmax(int[] arr) {
        //this is the efficient method

        int sum = 0;
        int maxsum = 0;
        int i;
        int len = arr.length;

        for(i=0; i<len; i++)
        {
            sum = sum + arr[i];
            if(maxsum < sum) {
                maxsum = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr1 = {-2, 3, 1, 3, -4,1, 2, -3, 5, -2};
        System.out.println("the max subArray is: " + maxsubarray(arr1));
        System.out.println("the max subArray using kadane's algorithm is: " + kadanesmax(arr1));
    }
}
