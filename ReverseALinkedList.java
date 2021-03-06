

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            ReverseLL g = new ReverseLL();
            head = g.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


//function Template for Java

/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */

class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
    Node reverseList(Node head){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}


