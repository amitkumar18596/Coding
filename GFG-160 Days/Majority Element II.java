//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        //find the length of the array
        int n = nums.length;
        
        //Intitilize two candidates and their counts
        int ele1 = -1, ele2 = -1;
        int count1 = 0, count2 = 0;
        
        for(int ele: nums){
            
            // Increment count for candidate 1
            if(ele1 == ele){
                count1++;
            }
            
            //Increment count for candidate 2
            else if(ele2 == ele){
                count2++;
            }
            
            // New candidate 1 if count1 is zero
            else if(count1 == 0){
                ele1 = ele;
                count1++;
            }
            
            // New candidate 2 if count 2 is zero
            else if(count2 == 0){
                ele2 = ele;
                count2++;
            }
            
            //Decrease counts if neither candidates
            else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        count1=0;
        count2=0;
        
        //count the occurances of the candidates
        for(int ele: nums){
            if(ele1 == ele)
                count1++;
            if(ele2 == ele)
                count2++;
        }
        
        // Add to result if they are majority elements
        if (count1 > n / 3) res.add(ele1);
        if (count2 > n / 3 && ele1 != ele2) res.add(ele2);
        
        //Sort the array in ascending order
        if (res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }
}
