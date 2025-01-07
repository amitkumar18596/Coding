//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int n=arr.length;
        int count=0;
        int left=0, right=n-1;
        
        while(left<right){
            //if the sum is greater
            if(arr[left]+arr[right] > target)
                right--;
            
            //if sum is lesser than taregt
            else if(arr[left]+arr[right] < target)
                left++;
                
            //if sum is equal
            else{
                int count1=0, count2=0;
                int ele1=arr[left], ele2=arr[right];
                
                //count freq of first ele of the pair
                while(left <= right && arr[left]==ele1){
                    left++;
                    count1++;
                }
                
                //count freq of 2nd ele of the pair
                while(left<=right && arr[right]==ele2){
                    right--;
                    count2++;
                }
                
                //if both ele are same then count of pair = number of ways to choose 2 elements among count 1 element
                if(ele1 == ele2){
                    count += (count1 * (count1 - 1)) /2;
                }
                else
                    count += count1*count2;
            }
        }
        return count;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends