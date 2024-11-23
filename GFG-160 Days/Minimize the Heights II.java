//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            // Ensure input is read correctly
            inputLine = br.readLine().trim().split(" ");
            if (inputLine == null || inputLine.length == 0) {
                System.out.println("Invalid input");
                continue;
            }

            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
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
            if(arr[i]-k < 0)
                continue;
                
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
