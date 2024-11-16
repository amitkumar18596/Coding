public class Pattern19 {
    public static void symmetry(int n) {
        // Write your code here
        int space =0;
        for (int i=0;i<n;i++){
            //star
            for (int j=1;j<=n-i;j++)
                System.out.print("* ");
            //space
            for (int j=0;j<space;j++)
                System.out.print("  ");
            //star
            for (int j=1;j<=n-i;j++)
                System.out.print("* ");
        System.out.println("\n");
        space += 2;
        }

         int space1 =2*n-2;
        for (int i=1;i<=n;i++){
            //star
            for (int j=1;j<=i;j++)
                System.out.print("* ");
            //space
            for (int j=0;j<space1;j++)
                System.out.print("  ");
            //star
            for (int j=1;j<=i;j++)
                System.out.print("* ");
        System.out.println("\n");
        space -= 2;
        }
    }
}
