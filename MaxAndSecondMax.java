
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends


        

//User function Template for Java

// Solution class to implement function largestAndSecondLargest
class ArrayMax{
    
    // Function to find largest and second largest element in the array
    static void largestAndSecondLargest(int sizeOfArray, int arr[]){
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        Arrays.sort(arr);
        // for(int i = sizeOfArray - 2; i >= 1; i--){
        //     if((arr[i]!= arr[sizeOfArray - 1])){
        //         max2 = arr[i];
        //     }
        // }
        for(int i = 0; i < sizeOfArray; i++){
            if(arr[i] > max)
            {
                   max2 = max;
                   max = arr[i];
            }
            if(arr[i] > max2 && arr[i] != max)
            {
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            max2 = -1;
        }
        System.out.println(max + " " + max2);
    }
}

// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    ArrayMax obj = new ArrayMax();
		    obj.largestAndSecondLargest(sizeOfArray, arr);
		}
	}
}  // } Driver Code Ends
