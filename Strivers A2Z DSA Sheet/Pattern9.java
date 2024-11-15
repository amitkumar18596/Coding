//https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern9 {
    public static void nStarDiamond(int n) {
        // Write your code here
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for (int k=0;k<2*i+1;k++)
                System.out.print("*");
            for (int j=0;j<n-i-1;j++)
                System.out.print(" ");

            System.out.println("\n");
        }
         for (int i=0;i<n;i++){
            for (int j=0;j<i;j++)
                System.out.print(" ");
            for (int k=0;k<((n*2)-(2*i+1));k++)
                System.out.print("*");
            for (int j=0;j<i;j++)
                System.out.print(" ");

            System.out.println("\n");
        }
    }
}
