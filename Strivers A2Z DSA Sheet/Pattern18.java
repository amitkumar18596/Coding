public class Pattern18 {
    public static void alphaTriangle(int n) {
        // Write your code here
        for (int i=1;i<=n;i++){
            char start =(char) ('A' +(n-1));
            for (int j=1;j<=i;j++){
                System.out.print(start-- +" ");
            }
            System.out.println("\n");
        }
    }
}
