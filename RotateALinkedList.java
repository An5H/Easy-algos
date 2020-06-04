import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i==0)
                {
                    head = new Node(a);
                    tail = head;
                }
                else{
                    tail.next = new Node(a);
                    tail = tail.next;
                }
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
class Rotate {
    
     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        if (k == 0) return head; 
  
        // Let us understand the below code for example k = 4 
        // and list = 10->20->30->40->50->60. 
        Node current  = head; 
  
        // current will either point to kth or NULL after this 
        // loop. current will point to node 40 in the above example 
        int count = 1; 
        while (count < k && current !=  null) 
        { 
            current = current.next; 
            count++; 
        } 
  
        // If current is NULL, k is greater than or equal to count 
        // of nodes in linked list. Don't change the list in this case 
        if (current == null) 
            return head; 
  
        // current points to kth node. Store it in a variable. 
        // kthNode points to node 40 in the above example 
        Node kthNode = current; 
  
        // current will point to last node after this loop 
        // current will point to node 60 in the above example 
        while (current.next != null) 
            current = current.next; 
  
        // Change next of last node to previous head 
        // Next of 60 is now changed to node 10 
  
        current.next = head; 
  
        // Change head to (k+1)th node 
        // head is now changed to node 50 
        head = kthNode.next; 
  
        // change next of kth node to null 
        kthNode.next = null;
        return head;
    }
}
