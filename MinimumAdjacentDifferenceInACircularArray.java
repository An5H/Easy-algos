import java.io.*;
import java.util.*;
import java.lang.*;


 // } Driver Code Ends


class Difference{
    
    // Function to find minimum adjacent difference
    // arr[]: input array
    // n: size of array
    public static int minAdjDiff(int arr[], int n) {
        ArrayList <Integer> check = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++){
            check.add(Math.abs(arr[i]-arr[i+1]));
        }
        check.add(Math.abs(arr[n-1] - arr[0]));
        int min = Integer.MAX_VALUE;
        for(int i: check){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}


// { Driver Code Starts.


class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Difference obj = new Difference();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		}
	}
}
  // } Driver Code Ends
