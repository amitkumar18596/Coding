//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            //initial it is not found
            boolean found = false;
            
            for(int j=0;j<n;j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    found = true;
                    break;
                }
            }
            
            //if character doesn't repeat then return it
            if(found == false)
                return s.charAt(i);
        }
        //if no such character found return $
        return '$';
    }
}
