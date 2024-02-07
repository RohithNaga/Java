package practisePrograms;

public class twoarrayEqual {
    public static void main(String[] args) {
        int[] a = {1, 23, 456, 7890};
        System.out.println("the first array is: ");
        for(int ele: a) {
            System.out.print(ele + " ");
        }
        int[] b = {1, 23, 456, 7890};
        System.out.println("\nthe second array is: ");
        for(int ele: b) {
            System.out.print(ele + " ");
        }

        boolean res = true;

        if(a.length == b.length) {
            for(int i=0; i<a.length; i++) {
                if(a[i] != b[i]) {
                    res = false;
                }
            }
        }
        else {
            res = false;
        }
        System.out.println();
        if(res == true) {
            System.out.println("the arrays are equal");
        }
        else {
            System.out.println("the arrays are not equal");
        }
    }
}
