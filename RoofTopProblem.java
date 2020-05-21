import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            int arr[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < n; i++)
              arr[(int)i] = Integer.parseInt(st[(int)i]);
              
            
            System.out.println(new Step().maxStep(arr, n));
        }
    }
    
    
}
    
    
// } Driver Code Ends


class Step{
    
    // Function to find the maximum steps
    // arr[]: input array
    // n: size of the array
    static int maxStep(int arr[], int n){
        int count = 0; 
        int maximum = 0; 
      
        for (int index = 1; index < n; index++) { 
              
            // count the number of consecutive  
            // increasing height building 
            if (arr[index] > arr[index - 1]) 
                count++; 
            else
            { 
                maximum = Math.max(maximum, count); 
                count = 0; 
            } 
        } 
          
        return Math.max(maximum, count);  
    }
}
