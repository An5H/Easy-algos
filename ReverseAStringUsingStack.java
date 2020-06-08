/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
	}
}
// } Driver Code Ends



class Solution {
    
    public void reverse(String str){
        Stack <Character> stack = new Stack <>();
        for(int i = 0; i < str.length(); i++){
            char cur = str.charAt(i);
           stack.push(cur);
        }
        String s = "";
        while(!stack.isEmpty()){
            s += stack.pop();
        }
        System.out.println(s);
    }
}
