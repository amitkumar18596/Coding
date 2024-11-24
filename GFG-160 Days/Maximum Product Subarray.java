//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        
        //Length of the array
        int n=arr.length;
        
        //initialize the multiplication as first element
        int maxMul = arr[0];
        
        for(int i=0;i<n;i++){
            int mul = 1;
            
            for(int j=i;j<n;j++){
                mul *= arr[j];
                
                maxMul = Math.max(maxMul, mul);
            }
        }
        return maxMul;
    }
}