import java.util.*;
import java.lang.*;

class CountSort
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            char seq[] = new char[(int)n+1];
            String str = "";
            str = sc.next();
            seq = str.toCharArray();
            GfG gfg = new GfG();
             gfg.countSort(seq);
            System.out.println(seq);
        }
    }
}
// } Driver Code Ends


class GfG
{
    
    // Function to do count sort
    // seq[]: input array
    public static void countSort(char seq[])
    {
        Arrays.sort(seq);   
    }
}
