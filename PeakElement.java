import java.util.*;
class PeakElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
		
			int A=new Peak().peakElement(a,n);
			int f=0;
			if(n==1)
			f=1;
			else
			if(A==0 && a[0]>=a[1])
			f=1;
			else if(A==n-1 && a[n-1]>=a[n-2])
			f=1;
			else if(a[A] >=a[A+1] && a[A]>= a[A-1])
			f=1;
			else
			f=0;
			System.out.println(f);
		}
	}
}// } Driver Code Ends


/*Complete the function below*/

class Peak
{
	// Function to find the peak element
	// a[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
        return findPeakUtil(a, 0, n-1, n);
    }
    static int findPeakUtil(int arr[], int low, int high, int n) 
    { 
        // Find index of middle element 
        int mid = low + (high - low)/2;  /* (low + high)/2 */
  
        // Compare middle element with its neighbours (if neighbours 
        // exist) 
        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || 
             arr[mid+1] <= arr[mid])) 
            return mid; 
  
        // If middle element is not peak and its left neighbor is 
        // greater than it,then left half must have a peak element 
        else if (mid > 0 && arr[mid-1] > arr[mid]) 
            return findPeakUtil(arr, low, (mid -1), n); 
  
        // If middle element is not peak and its right neighbor 
        // is greater than it, then right half must have a peak 
        // element 
        else return findPeakUtil(arr, (mid + 1), high, n); 
    } 
}
