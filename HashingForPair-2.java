//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr[] =  new int[sizeOfArray];  //array declaration
            
            for(int i = 0; i < sizeOfArray; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, sizeOfArray, sum));
        }
    }
}


 // } Driver Code Ends


//User function Template for Java


class Geeks
{
    //Complete this function
    public static int sumExists(int arr[], int sizeOfArray, int sum)
    {
        
        for(int i = 0; i < sizeOfArray; i++){
           for(int j = 0; j < sizeOfArray; j++){
               if(arr[i]+arr[j] == sum && i!=j){
                   return 1;
               }
           }
       }
       return 0;
     }
      
    
}

// { Driver Code Starts.
  // } Driver Code Ends
