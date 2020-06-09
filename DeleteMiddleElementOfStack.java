/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int testcases=sc.nextInt();
	    
	    while(testcases-->0)
	    {
	        int sizeOfStack =sc.nextInt();
	        
	        Stack <Integer> myStack=new Stack<>();
	        
	        for(int i=0;i<sizeOfStack;i++)
	        {
	            int x=sc.nextInt();
	            myStack.push(x);
	            
	        }
	        
	        if(sizeOfStack==1)
	        {
	            System.out.println(myStack.peek());
	        }
	        else
	        {
	            Geeks obj=new Geeks();
	            Stack <Integer> modified=obj.deleteMid(myStack,sizeOfStack,0);
	            
	            while(!modified.isEmpty())
	            {
	                System.out.print(modified.peek()+" ");
	                modified.pop();
	            }
	            System.out.println();
	        }
	    }
	    
	    
	}
}
// } Driver Code Ends


//User function Template for Java

class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>st,int n,int curr)
    {   
        if (st.empty() || curr == n) 
            return st; 
          
        // Remove current item 
        int x = st.pop(); 
          
        // Remove other items 
        deleteMid(st, n, curr+1); 
          
        // Put all items back except middle 
        if (curr != n/2) 
            st.push(x);
            
        return st;
    } 
}


