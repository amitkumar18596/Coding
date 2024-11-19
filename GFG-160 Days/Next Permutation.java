public class Next Permutation {
    //{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        //Identify the rightmost element that is smaller than its next element. This is called pivot element
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i] < arr[i+1])
                pivot = i;
                break;
        }
        
        //If Pivot doesn't exist then reverse the whole array and that's the resultant next permutation
        if(pivot == -1){
            reverse(arr, 0, n-1);
            return;
        }
        
        //Find the rightmost element that is greater than pivot
        for(int i=n-1; i>pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, i, pivot); //Swap pivot and rightmost greater element
                break;
            }
        }
        
        
       //Reverse the array from pivot+1 to end of the array
       reverse(arr, pivot+1, n-1);
        
        
        //And the sequence result is the next permutataion
        
        
    }
    //Function to reverse an array
        public static void reverse(int[] arr, int start, int end){
            while(start<end){
                swap(arr, start++, end--);
            }
        }
        
        // Function to swap elements in an array
        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}

//{ Driver Code Starts.

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine()); // Number of test cases
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int N = arr.length;
            Solution ob = new Solution();
            ob.nextPermutation(arr); // Generate the next permutation
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < N; i++) {
                out.append(arr[i] + " "); // Corrected: use arr[i] instead of arr.get(i)
            }
            System.out.println(out.toString().trim()); // Print the output

            System.out.println("~");
        }
    }
}
// } Driver Code Ends
}
