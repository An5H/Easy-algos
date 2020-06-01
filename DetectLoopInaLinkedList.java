// Java program to detect loop in a linked list
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    static Node head; // head of list
    /* Linked list Node*/
    /* Inserts a new Node at front of the list. */
    public static void push(int new_data) {
        /* 1 & 2: Allocate the Node & Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    /* Drier program to test above functions */
    public static void main(String args[]) {
        int t, d, n, i, x, c;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (d = 0; d < t; d++) {
            n = sc.nextInt();
            // GFG gfg = new GFG();
            head = null;
            Node q;
            for (i = 0; i < n; i++) {
                x = sc.nextInt();
                push(x);
            }
            Node p;
            p = head;
            q = head;
            while (q.next != null) q = q.next;
            c = sc.nextInt();
            if (c > 0) {
                c = c - 1;
                for (i = 0; i < c; i++) {
                    p = p.next;
                }
                q.next = p;
            }
            Solution sln = new Solution();
            if (sln.detectLoop(head) == 1)
                System.out.print("True\n");
            else
                System.out.print("False\n");
            // System.gc();
        }
    }
}
// } Driver Code Ends


/* Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class Solution {
    public int detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>(); 
        while (h != null) { 
            // If we have already has this node 
            // in hashmap it means their is a cycle 
            // (Because you we encountering the 
            // node second time). 
            if (s.contains(h)) 
                return 1; 
  
            // If we are seeing the node for 
            // the first time, insert it in hash 
            s.add(h); 
  
            h = h.next; 
        } 
  
        return 0;
    }
}
