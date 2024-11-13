//https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern8 {
    public static void nStarTriangle(int n) {
        // Write your code here
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
