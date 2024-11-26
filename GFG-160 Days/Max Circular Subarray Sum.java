//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        //length of the array
        int n=arr.length;
        
        int totalSum = 0;
        int currentMaxSum = 0, currentMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i=0;i<n;i++){
            //Kadane's algo to find max subatrray
            currentMaxSum = Math.max(currentMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
            
            //Kadane's algo to find min subarray
            currentMinSum = Math.min(currentMinSum+arr[i], arr[i]);
            minSum = Math.min(minSum, currentMinSum);
            
            //sum of all the element of input array
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        //if min sum is equal to total sum then we need to return normal sum
        if(minSum == totalSum)
            return totalSum;
            
        return Math.max(normalSum, circularSum);
    }
}
