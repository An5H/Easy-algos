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
		    Divisors obj=new Divisors();
		    int N;
		    N=sc.nextInt();
		    
		    System.out.println(obj.exactly3Divisors(N));
		   
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Divisors
{
    
    public int exactly3Divisors(int n)
    {
        boolean[] prime = new boolean[n+1]; 
        Arrays.fill(prime, true); 
        prime[0] = prime[1] = false; 
   
        for (int p=2; p*p<=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if (prime[p] == true) 
            { 
                // Update all multiples of p 
                for (int i=p*2; i<=n; i += p) 
                    prime[i] = false; 
            } 
        } 
        int count =0;
        // print squares of primes upto n 
        //System.out.println("Numbers with 3 divisors : "); 
        for (int i=0;  i*i <= n ; i++) 
            if (prime[i]) 
                count++;
        return count;
    }
}
