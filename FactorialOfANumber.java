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
		    Factorial  obj=new Factorial ();
		    int N;
		    N=sc.nextInt();
		   System.out.println(obj.factorial(N));
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Factorial
{
    
    public long factorial (int N)
    {
        if(N == 0){
            return 1;
        }
        return N* factorial(N-1);
    }

}
