// https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

//{ Driver Code Starts

// } Driver Code Ends
//Back-end complete function Template for Java
import java.util.*;

public class While_loop {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i =10;
        while(i>0){
            System.out.print(n*i + " ");
            i--;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends