import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n = Integer.parseInt(br.readLine());
	        String l = br.readLine();
    		String[] sarr = l.split(" ");
    		int[] arr = new int[sarr.length];
    		for(int i1=0;i1<arr.length;i1++){
    			arr[i1] = Integer.parseInt(sarr[i1]);
    		}
    		
            Repeated obj = new Repeated();
            
            obj.twoRepeated(arr, n);
            	System.out.println();
    		
    		
	    }
	 }
}// } Driver Code Ends


class Repeated{

    static void twoRepeated(int arr[], int n){
        int count[] = new int[arr.length]; 
        int i; 
        for (i = 0; i < arr.length; i++)  
        { 
            if (count[arr[i]] == 1) 
                System.out.print(arr[i] + " "); 
            else
                count[arr[i]]++; 
        } 
    }
}
