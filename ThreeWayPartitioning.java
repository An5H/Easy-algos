
import java.util.*;
import java.io.*;
import java.lang.*;


class Three{
	public static void main(String[] args)throws IOException 
	{
// 		Scanner sc=new Scanner(System.in);
// 		int t=sc.nextInt();
		 BufferedReader read= new BufferedReader(new InputStreamReader(System.in));
		 int t  =Integer.parseInt(read.readLine());
		 
		while(t-->0)
		{
    		int N = Integer.parseInt(read.readLine());
    		ArrayList<Integer> A=new ArrayList<>();
    		int[] hash=new int[1000001];
    		Arrays.fill(hash,0);
    		
    		String str[] = read.readLine().trim().split(" ");
    		for(int i=0;i<N;i++)
    		{
    		    int val = Integer.parseInt(str[i]);
    		    A.add(i,val);
    		
    		    hash[A.get(i)]++;
		    }
		    
		    str = read.readLine().trim().split(" ");
    		int n = Integer.parseInt(str[0]);
    		int m = Integer.parseInt(str[1]);
		
    		ArrayList<Integer> B=new ArrayList<>();
    		for(int i=0;i<A.size();i++)
    		{
    			B.add(i,A.get(i));
    		}
            int k1=0,k2=0,k3=0;
            int kk1=0;int kk2=0;int kk3=0;
            for(int i=0;i<B.size();i++)
            {
            	if(B.get(i)>m)
            	{
            		k3++;
            	}else if(B.get(i)<=m && B.get(i)>=n)
            	{
            		k2++;
            	}else if(B.get(i)<m)
            	k1++;
            }
    		GfG g = new GfG();
    		ArrayList<Integer> Res = g.threeWayPartition(A,n,m);
          	for(int i=0;i<k1;i++)
          	{
          		if(Res.get(i)<m)
          		kk1++;
          	}
          	for(int i=k1;i<k1+k2;i++)
          	{
          		
          		if(Res.get(i)<=m && Res.get(i)>=n)
          		kk2++;
          		
          	}
          	for(int i=k1+k2;i<k1+k2+k3;i++)
          	{
          		if(Res.get(i)>m)
          		kk3++;
          	}
          	boolean ok = false;
          	if(k1==kk1 && k2 ==kk2 && k3 == kk3)
          	ok = true;
    	
    	    for(int i=0;i<Res.size();i++)
          		hash[Res.get(i)]--;
          	
          	for(int i=0;i<Res.size();i++)
          	if(hash[Res.get(i)]!=0)
          	ok=false;
          	
        	if(ok)
        		System.out.println(1);
        		else
        		System.out.println(0);
        		}
	}
}

// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int a, int b)
	{   int index = 0;
	    int arr[] = new int[A.size()];
	    for(int i: A){
	        arr[index] = i;
	        index++;
	    }
	    ArrayList <Integer> arry = new ArrayList<>();
	    int  n = arr.length; 
        int lowVal = a;
        int highVal = b;
        // Initialize ext available positions for 
        // smaller (than range) and greater lements 
        int start = 0, end = n-1; 
          
         // Traverse elements from left 
        for(int i = 0; i <= end;) 
        { 
              
            // If current element is smaller than 
            // range, put it on next available smaller 
            // position. 
              
            if(arr[i] < lowVal) 
            { 
                  
                int temp = arr[start]; 
                arr[start] = arr[i]; 
                arr[i] = temp; 
                start++; 
                i++; 
                  
            } 
              
            // If current element is greater than 
            // range, put it on next available greater 
            // position. 
            else if(arr[i] > highVal) 
            { 
                  
                int temp = arr[end]; 
                arr[end] = arr[i]; 
                arr[i] = temp; 
                end--; 
                   
            } 
              
            else
            i++; 
        } 
        for(int i : arr){
            arry.add(i);
        }
        return arry;
    }
}
