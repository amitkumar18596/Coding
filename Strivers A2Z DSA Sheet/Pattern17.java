public class Pattern17 {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i-1;j++)
                System.out.print(" ");
            //char
            char start = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j=1;j<=2*i+1;j++){
                if(j<=breakpoint) 
                    System.out.print(start++ +" ");
                else
                    System.out.print(start-- +" ");
            }
            //space
            for (int j=0;j<n-i-1;j++)
                System.out.print(" ");
        System.out.println("\n");
        }
    }
}
