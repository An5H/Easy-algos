//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		while(T-->0)
		{
		    MM obj=new MM();
		    int N;
		    N=sc.nextInt();
		    int a[]=new int [N];
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    
		    
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));
		   
		    
		}
		
	}
}



// } Driver Code Ends


//User function Template for Java

class MM
{
    
  public int median(int A[],int N)
    {
       //Your code here
       //If median is fraction then conver it to integer and return
       int mid = A.length/2;
       Arrays.sort(A);
       if(A.length%2 != 0){
           return A[mid];
       }
       else{
           int med = (A[mid-1]+A[mid])/2;
           return med;
       }
    }
    
    public int mean(int A[],int N)
    {
       int sum = 0;
       for(int i: A){
           sum += i;
       }
       return sum/N;
    }

}

