public class Pattern14 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        
        for (int i=0;i<n;i++){
            char start = 'A';
            for (int j=0;j<=i;j++){
                System.out.print(start +" ");
                start++;
            }
            System.out.println("\n");
        }
    }
}
