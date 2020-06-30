//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends


//User function Template for Java


class ConsecutiveOne{
    
    /*  Function to calculate the largest consecutive ones
    *   x: given input to calculate the largest consecutive ones
    */
    public static int maxConsecutiveOnes(int x) {
        int count = 0;
        while(x != 0){
            x = (x & (x << 1));
            count++;
        }
        return count;
        
    }
}



// { Driver Code Starts.

class BitWise {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    
		    ConsecutiveOne obj = new ConsecutiveOne();
		    
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}


  // } Driver Code Ends
