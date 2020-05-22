//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends


//User function Template for Java

class CountBitFlip{
    
    // Function to count number of bits to 
    // be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        //int A = Integer.parseInt(Integer.toBinaryString(a));
        //int B = Integer.parseInt(Integer.toBinaryString(b));
        
        return countSetBits(a^b);
        
    }
    public static int countSetBits(int n) 
    { 
  
        // base case 
        if (n == 0) 
            return 0; 
  
        else
  
            // if last bit set add 1 else add 0 
            return (n & 1) + countSetBits(n >> 1); 
    }
}


// { Driver Code Starts.

// Driver class
class BitWise {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    m = sc.nextInt();
		    n = sc.nextInt();
		    CountBitFlip obj = new CountBitFlip();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}

  // } Driver Code Ends
