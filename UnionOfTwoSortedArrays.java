//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t  =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String st[] = read.readLine().trim().split(" ");
            int N = Integer.parseInt(st[0]);
            int M = Integer.parseInt(st[1]);
            
            int arr1[] = new int[N];
            int arr2[] = new int[M];
            
            st = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
              arr1[i] = Integer.parseInt(st[i]);
            
            st = read.readLine().trim().split(" ");  
            for(int i = 0; i< M; i++)
              arr2[i] = Integer.parseInt(st[i]);
            
            Union obj = new Union();
            obj.findUnion(arr1, arr2, N, M);
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Union
{
    
    static void findUnion(int arr1[], int arr2[], int n, int m)
    {
        int arr[] = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                arr[k++] = arr2[j++];
            }
        }
        while(i < n){
            arr[k++] = arr1[i++];
        }
        while(j < m){
            arr[k++] = arr2[j++];
        }
        for(int in = 1; in < n+m; in++){
            if(arr[in-1] != arr[in]){
                System.out.print(arr[in-1]+" ");
            }
        }
        System.out.print(arr[n+m-1]);
    }
}



