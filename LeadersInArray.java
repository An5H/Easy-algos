import java.io.*;
import java.util.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.leaders(arr, n);
		    
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends


class Leader{
    
    // This functions find the leaders in the array and returns
    // arraylist containing the leaders
    // arr: input array
    // n: size of array
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> arry = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] >= max){
                max = arr[i];
                arry.add(max);
            }
        }
        return arrayList(arry);
    }
    public static ArrayList<Integer> arrayList(ArrayList<Integer> arr){
        ArrayList<Integer> arry = new ArrayList<>();
        for(int i = arr.size() - 1; i >= 0; i--){
            arry.add(arr.get(i));
        }
        return arry;
    }
}
