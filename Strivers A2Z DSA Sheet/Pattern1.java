//https://www.naukri.com/code360/problems/n-forest_6570177?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern1 {
    public static void nForest(int n) {
        // Write your code here
        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
