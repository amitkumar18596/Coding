//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int[] res=new int[n];
        int[] prefProduct = new int[n];
        int[] suffProduct = new int[n];
        
        //construct the prefProduct array
        prefProduct[0]=1;
        for(int i=1;i<n;i++){
            prefProduct[i] = arr[i-1]*prefProduct[i-1];
        }
        
        //construct suffProduct array
        suffProduct[n-1]=1;
        for(int j=n-2;j>=0;j--)
            suffProduct[j] = arr[j+1]*suffProduct[j+1];
        
        //construct the resultant array
        for(int i=0;i<n;i++)
            res[i]=prefProduct[i]*suffProduct[i];
            
        return res;
    }
}
