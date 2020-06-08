//Initial Template for Java

import java.util.*;
class ModifyQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            while(n-->0){
                q.add((int)sc.nextInt());
            }
            GfG g=new GfG();
            Queue<Integer> ans=g.modifyQueue(q,k);
            while(!ans.isEmpty()){
                int a=ans.peek();
                ans.poll();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GfG
{
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        Stack <Integer> stack = new Stack <>();
        Queue <Integer> modQ = new LinkedList <>();
        
        for(int i = 0; i < k; i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            modQ.add(stack.pop());
        }
        while(!q.isEmpty()){
            modQ.add(q.poll());
        }
        return modQ;
    }
}
