//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        
        int n=arr.length;
        Arrays.sort(arr);
        
        //initialize a list
        List<Integer> res = new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        
        //implement binary search
        int lo=0, hi=n-1;
        
        while(lo<hi){
            //find the sum between fist and last element of array
            int sum=arr[lo]+arr[hi];
            
            
            //check if the pair is closer than the closet pair
            if(Math.abs(target-sum) < diff){
                //Find the diff between sum of pairs and target
                diff=Math.abs(target-sum);
                res=Arrays.asList(arr[lo], arr[hi]);
            }
                
            
            //if the pair has less sum move to greater value
            if(sum<target)
                lo++;
            else if(sum>target)
                hi--;
            else // if(sum==target)
                return res;
        }
        return res;
        
    }
}