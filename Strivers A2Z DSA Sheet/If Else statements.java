//https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%255B%255D=Java&difficulty%255B%255D=-2&page=1&query=category%255B%255DJavadifficulty%255B%255D-2page1category%255B%255DJava

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int m;
            m = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            String res = obj.compareNM(n, m);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}


// } Driver Code Ends
//User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n < m){
            return "lesser";
        }
        else if (n > m){
            return "greater";
        }
        else {
            return "equal";
        }
    }
}

//{ Driver Code Starts.

// } Driver Code Ends