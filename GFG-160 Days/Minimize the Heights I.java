//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases (t)
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());
            String input = br.readLine().trim();

            // Split the input line into integers and store them in the array
            String[] tokens = input.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            // Create an instance of the Solution class
            Solution ob = new Solution();

            // Call the getMinDiff method
            int res = ob.getMinDiff(k, arr);

            // Print the result
            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int getMinDiff(int k, int[] arr) {
        // code here
        //length of array
        int n=arr.length;
        
        //sort the array
        Arrays.sort(arr);
        
        //initially the minimum possible difference
        int minDiff = arr[n-1] - arr[0];
        
        //incresent by k till i and decrement from i to n by k
        for (int i=1;i<n;i++){
            
            //if arr[i]-k it will go negative hence no action
            
                
            //min height after modification
            int minHeight = Math.min(arr[0]+k, arr[i]-k);
            
            //max height after modification
            int maxHeight = Math.max(arr[i-1]+k, arr[n-1]-k);
            
            //now fond the min diff between them
            minDiff = Math.min(minDiff, maxHeight-minHeight);
        }
        
        return minDiff;
    }
}