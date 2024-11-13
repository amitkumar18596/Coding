//https://www.naukri.com/code360/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern5 {
    public static void seeding(int n) {
        // Write your code here
        for (int i=0; i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
