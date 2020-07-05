//Initial Template for Java
import java.io.*;
import java.util.*;


 // } Driver Code Ends


//User function Template for Java

class AND{
    
    // Function for finding maximum and value pair
    public static int maxAND (int arr[], int n) {
        int res = 0, count; 
       
        // iterate over total of 30bits  
        // from msb to lsb 
        for (int bit = 31; bit >= 0; bit--) 
        { 
            // find the count of element 
            // having set msb 
            count = checkBit(res | (1 << bit), arr, n); 
       
            // if count >= 2 set particular  
            // bit in result 
            if ( count >= 2 )      
                res |= (1 << bit);      
        } 
       
        return res;
        
    }
    static int checkBit(int pattern, int arr[], int n) 
    { 
        int count = 0; 
        for (int i = 0; i < n; i++) 
            if ((pattern & arr[i]) == pattern) 
                count++; 
        return count; 
    } 
    
}

// { Driver Code Starts.

class BitWise {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    AND obj = new AND();
		    
		    System.out.println(obj.maxAND(arr, n));
		}
	}
}
  // } Driver Code Ends
