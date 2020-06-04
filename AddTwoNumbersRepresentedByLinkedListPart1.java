import java.util.*;
class Node {
    int data;
    Node next;

    Node() {}
    Node(int d) {
        data = d;
        next = null;
    }
} class Add_LinkedList {
    Node head;

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        // System.out.println("");
    }

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n1 = sc.nextInt();
            Add_LinkedList list1 = new Add_LinkedList();
            for (int i = 1; i <= n1; i++) {
                int a = sc.nextInt();
                list1.push(a);
            }
            int n2 = sc.nextInt();
            Add_LinkedList list2 = new Add_LinkedList();
            for (int i = 0; i < n2; i++) {
                int b = sc.nextInt();
                list2.push(b);
            }
            Add_LinkedList list3 = new Add_LinkedList();
            Add g = new Add();
            Node rs = g.addTwoLists(list1.head, list2.head);
            list3.printList(rs);
            System.out.println();
            T--;
        }
    }
}// } Driver Code Ends


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/

class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        Node res = null; // res is head node of the resultant list 
        Node prev = null; 
        Node temp = null; 
        int carry = 0, sum; 
  
        while (first != null || second != null) //while both lists exist 
        { 
            // Calculate value of next digit in resultant list. 
            // The next digit is sum of following things 
            // (i)  Carry 
            // (ii) Next digit of first list (if there is a next digit) 
            // (ii) Next digit of second list (if there is a next digit) 
            sum = carry + (first != null ? first.data : 0) 
                    + (second != null ? second.data : 0); 
  
            // update carry for next calulation 
            carry = (sum >= 10) ? 1 : 0; 
  
            // update sum if it is greater than 10 
            sum = sum % 10; 
  
            // Create a new node with sum as data 
            temp = new Node(sum); 
  
            // if this is the first node then set it as head of 
            // the resultant list 
            if (res == null) { 
                res = temp; 
            } else // If this is not the first node then connect it to the rest. 
            { 
                prev.next = temp; 
            } 
  
            // Set prev for next insertion 
            prev = temp; 
  
            // Move first and second pointers to next nodes 
            if (first != null) { 
                first = first.next; 
            } 
            if (second != null) { 
                second = second.next; 
            } 
        } 
  
        if (carry > 0) { 
            temp.next = new Node(carry); 
        } 
  
        // return head of the resultant list 
        return res;
    }
}
