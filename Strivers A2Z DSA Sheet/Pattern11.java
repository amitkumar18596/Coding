//https://www.naukri.com/code360/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

public class Pattern11 {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j){
                    System.out.print(1+" ");
                    break;
                      }
                if((i+j) % 2 == 0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
                

            }
            System.out.println("\n");
        }
    }
}
