//https://www.naukri.com/code360/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i=0; i<n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+ " ");
            }
            System.out.println("\n");
        }
    }
}
