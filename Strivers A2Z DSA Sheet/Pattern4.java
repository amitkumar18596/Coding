//https://www.naukri.com/code360/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern4 {
    public static void nTriangle(int n) {
        // Write your code here
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print(i+" ");
            }
            System.out.println("\n");
        }
    }
}
