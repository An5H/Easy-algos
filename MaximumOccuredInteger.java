import java.io.*;
import java.util.*;
import java.lang.*;

class ArrayOccur {
        
    	public static void main (String[] args) throws IOException{
    	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int L[] = new int[n];
		    int R[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        L[i]=Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    int maxx = Integer.MIN_VALUE;
		    for(int i=0; i<n; i++){
		        R[i]=Integer.parseInt(inputLine[i]);
		        if(R[i] > maxx){
		            maxx=R[i];
		        }
		    }
		    
		    MaxOccur obj = new MaxOccur();
		    
		    System.out.println(obj.maxOccured(L, R, n, maxx));
		}
	}
	
}



 // } Driver Code Ends


// L[] and R[] are input ranges
// n : size of array
// maxx: maximum element in R[]
// arr[]: declared globally with size equal to 1000000
class MaxOccur{
    static int max = 1000000;
    public static int maxOccured(int L[], int R[], int n, int maxx){
        int arr[] = new int[max];
        int maxi = -1;
        for(int i = 0; i < n; i++){
            arr[L[i]] += 1;
            arr[R[i]+1] -= 1;
            if(R[i] > maxi){
                maxi = R[i];
            }
        }
        // Finding prefix sum and index 
        // having maximum prefix sum. 
        int msum = arr[0]; 
        int ind = 0; 
        for (int i = 1; i < maxi+1; i++) { 
            arr[i] += arr[i - 1]; 
            if (msum < arr[i]) { 
                msum = arr[i]; 
                ind = i; 
            } 
        } 
  
        return ind; 
    }
}

// { Driver Code Starts.
  // } Driver Code Ends
