package patterns;

public class pattern3 {
    public static void main(String[] args) {
        int i, j;
        int n = 6;
        int m = 6;

        for(i = 1; i <= n; i++) {
            for(j = 1; j <= m; j++) {

                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
