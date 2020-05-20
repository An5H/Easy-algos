import java.util.*;
import java.lang.*;
import java.io.*;

class Searching
{
    public static void main (String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
           String a[] = read.readLine().trim().split("\\s+");
           int n = Integer.parseInt(a[0]);
           long x = Long.parseLong(a[(int)1]);
           String st[] = read.readLine().trim().split("\\s+");
        
           long arr[] = new long[n];
           for(int i = 0; i < n; i++)
           {
               arr[i] = Long.parseLong(st[i]);
           }
           
           System.out.println(new FloorSearch().findFloor(arr, 0, n-1, x));
          
        }
    }
    
}// } Driver Code Ends


class FloorSearch{
    
    // Function to find floor of x
    // arr: input array
    // left and right as 0 and n-1, where n is the size of array
    static int findFloor(long arr[], int left, int right, long x)
    {
        int k = 0;
        for(int i = left; i <= right; i++){
            if(arr[0] > x){
                return -1;
            }
            if(arr[i] <= x){
                k = i;
            }
        }
        if(k >= 0){
            return k;
        }
        return -1;
    }
    
}
