//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    //function to find the factorial
    static long factorial(long k){
        if(k==0 || k==1)
            return 1;
        return k*factorial(k-1);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> fact = new ArrayList<>();
        
        int i=1;
        
        while(true){
            long f = factorial(i);
            
            if(f<=n)
                fact.add(f);
            else
                break;
                
            i++;
        }
        
        return fact;
    }
}