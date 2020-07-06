//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Arrays {
    
    static int arr[] = new int[5000001];
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Ones obj = new Ones();
		    System.out.println(obj.countOnes(n));
		    
		    
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Ones{
    
    // Object of Arrays class to access array declared
    // in Arrays class
    // To access i-th element of array, use obj.arr[i]
    static Arrays obj = new Arrays();
    
    // Function to count number of ones in the binary array
    // n: size of array
    // To access i-th element of array, use obj.arr[i]
    static int index = 0, count = 0;
    public static int countOnes(int n){
        int low = 0, high = n-1;
        return check(obj.arr, low, high);
    }
    public static int check(int arr[], int low, int high){
        if(high >= low){
            int mid = (low + high)/2;
                if ( (mid == high || arr[mid+1] == 0) && 
                 (arr[mid] == 1)) 
              return mid+1; 
      
            // If element is not last 1, recur for right side 
            if (arr[mid] == 1) 
              return check(arr, (mid + 1), high); 
      
            // else recur for left side 
            return check(arr, low, (mid -1)); 
          } 
          return 0;
    }
}

