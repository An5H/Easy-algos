//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

 //static Node head; 
  
   class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 

public class LinkedList1
{
    static  Node head;  // head of lisl
    static  Node lastNode;
    //static PrintWriter out;
    /* Linked list Node*/


    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            lastNode.next = node;
            lastNode = node;
        }
    }
    /* Function to print linked list */
     static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        //System.out.println();
    }



    /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //out = new PrintWriter(new BufferedOutputStream(System.out));
        int t= Integer.parseInt(br.readLine());
            
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            Node head = null;

            //LinkedList1 llist = new LinkedList1();
                        String str = br.readLine();
                        String nums[] = str.trim().split("\\s+");
            
                int a1= Integer.parseInt(nums[0]);
                head= new Node(a1);
                addToTheLast(head);
            
            for (int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(nums[i]);
                addToTheLast(new Node(a));
            }


            head = new Swap().pairwise_swap(head);
            
            printList(head);
            System.out.println();
            
            t--;
        }
        //out.close();
    }
}

 // } Driver Code Ends


//User function Template for Java

/*class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } */
class Swap
{
    public static Node pairwise_swap(Node node)
    {
        Node temp = node;
        
        while(temp != null && temp.next != null){
            int cur = temp.data;
            temp.data = temp.next.data;
            temp.next.data = cur;
            temp = temp.next.next;
        }
        return node;
    }
}

// { Driver Code Starts
  // } Driver Code Ends
