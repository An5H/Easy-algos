import java.io.*;
import java.lang.*;
import java.util.*;

class Array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            
            int arr[] = new int[(int)n];
            
            for(long i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            System.out.println(new MinimumNumber().minNumber(arr,0,n-1));
            
        }
    }
    
}// } Driver Code Ends


class MinimumNumber{
    
    static long minNumber(int arr[], long low, long high)
    {
        if (high < low)  return arr[0]; 
  
        // If there is only one element left 
        if (high == low) return arr[(int)low]; 
  
        // Find mid 
        int mid = (int)(low + (high - low)/2); /*(low + high)/2;*/
  
        // Check if element (mid+1) is minimum element. Consider 
        // the cases like {3, 4, 5, 1, 2} 
        if (mid < high && arr[mid+1] < arr[mid]) 
            return arr[mid+1]; 
  
        // Check if mid itself is minimum element 
        if (mid > low && arr[mid] < arr[mid - 1]) 
            return arr[mid]; 
  
        // Decide whether we need to go to left half or right half 
        if (arr[(int)high] > arr[mid]) 
            return minNumber(arr, low, mid-1); 
        return minNumber(arr, mid+1, high); 
    }
    
}
