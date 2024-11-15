public class Pattern13 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int start = 1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++)
                System.out.print(start++ +" ");
            System.out.println("\n");
        }
    }
}
