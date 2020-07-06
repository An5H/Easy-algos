
import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Inversion_of_Array().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java
//Initial Template for Java
//User function Template for Java
class Inversion_of_Array
{
    // Fucntion to count the number of inversions
    // arr[]: input array
    // n: size of array
    static long inversionCount(long arr[], long n)
    {
        int arry[] = new int[(int)n];
        for(int i= 0; i < (int)n; i++){
            arry[i] = (int)arr[i];
        }
        int[] aux = Arrays.copyOf(arry, arry.length);
        return mergeSort(arry, aux, 0, ((int)n - 1));
    }
    public static long merge(int[] arr, int[] aux, int low, int mid, int high)
	{
		int k = low, i = low, j = mid + 1;
		long inversionCount = 0;

		// While there are elements in the left and right runs
		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				aux[k++] = arr[i++];
			}
			else {
				aux[k++] = arr[j++];
				inversionCount += (mid - i + 1);	// NOTE
			}
		}

		// Copy remaining elements
		while (i <= mid)
			aux[k++] = arr[i++];

		// Don't need to copy second half

		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			arr[i] = aux[i];
		}

		return inversionCount;
	}

	// Sort array arr [low..high] using auxiliary array aux
	public static long mergeSort(int[] arr, int[] aux, int low, int high)
	{
		// Base case
		if (high == low) {	// if run size == 1
			return 0;
		}

		// find mid point
		int mid = (low + ((high - low) >> 1));
		long inversionCount = 0;

		// recursively split runs into two halves until run size == 1,
		// then merge them and return back up the call chain

		// split / merge left  half
		inversionCount += mergeSort(arr, aux, low, mid);

		// split / merge right half
		inversionCount += mergeSort(arr, aux, mid + 1, high);

		// merge the two half runs
		inversionCount += merge(arr, aux, low, mid, high);

		return inversionCount;
	}
}
