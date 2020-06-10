//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class BitWise {
    
    
 // } Driver Code Ends


//User function Template for Java

/*  Function to find position with first set bit
*   n: input integer
*/
public static int getFirstSetBitPos(int n){
    if(n == 0){
        return 0;
    }
    return (int)((Math.log10(n & -n)) / Math.log10(2)) + 1; 
}

// { Driver Code Starts.
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			System.out.println(getFirstSetBitPos(n));
		}
	}
}
  // } Driver Code Ends
