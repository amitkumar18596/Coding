public class Pattern15 {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i=0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++)
                System.out.print(j+" ");
            System.out.println("\n");
        }
    }
}
