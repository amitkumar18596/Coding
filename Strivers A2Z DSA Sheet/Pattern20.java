public class Pattern20 {
    public static void symmetry(int n) {
        // Write your code here
        int space = 2*n-2;
        for (int i=0;i<n;i++){
            //stars
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            //space
            for (int j=0;j<space;j++)
                 System.out.print(" ");
            //stars
            for (int j=0;j<=i;j++)
                System.out.print("* ");

        System.out.println("\n");
        space -= 2;
        }
        int space1 = 2;
        for (int i=1;i<n;i++){
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
    }
}
