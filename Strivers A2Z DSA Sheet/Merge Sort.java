//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    //merge two subarrays
    static void merge(int arr[], int l, int m, int r){
        //find sizes of two subarrys to be merged
        int n1=m-l+1;
        int n2=r-m;
        
        //create temporary arrays
        int[] L=new int[n1];
        int[] R=new int[n2];
        
        //copy data to temporary arrays
        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];
        
        for(int j=0;j<n2;j++)
            R[j]=arr[m+1+j];
            
        int i=0, j=0, k=l;
        
        while(i<n1 && j<n2){
            if(L[i] <= R[j])
                arr[k++]=L[i++];
            else
                arr[k++]=R[j++];
        }
        
        //copy remaining elements of L
        while(i<n1){
            arr[k++]=L[i++];
        }
        
        //copy remaining elements of R
        while(j<n2){
            arr[k++]=R[j++];
        }
    }

    void mergeSort(int arr[], int l, int r) {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
