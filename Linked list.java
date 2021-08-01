///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Print all the elements of the linked list


import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



public class linkedlist {

    Node head;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }
 public static void main(String args[]) {

        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            linkedlist llist = new linkedlist();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
                    
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }	
            Solution ob=new Solution();
            ob.display(llist.head);
        System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //add code here.
        if(head==null)
        return;
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Reverse a linked list
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
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node current=head;
        Node prev=null,next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Occurence of an integer in a Linked List

import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Occurrence
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            int k = sc.nextInt();
            Solution ob= new Solution();
            System.out.println(ob.count(head, k));
        }
    }
    
    public static void addToTheLast(Node node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next !=  null)
              temp = temp.next;
              temp.next = node;
        }
    }
}// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution
{
    public static int count(Node head, int search_for)
    {
        //code here
        Node curr=head;int c=0;
        while(curr!=null)
        {
            if(curr.data==search_for)
            c++;
            curr=curr.next;
        }
        return c;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Pairwise swap elements of a linked list

import java.util.*;
import java.io.*;

public class Node{
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
            HashMap<Node, Integer> mp = new HashMap<Node, Integer>();
            mp.put(head, head.data); 
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
                mp.put(tail, tail.data); 
            }
            
            Node failure = new Node(-1);
            
            Solution g = new Solution();
            head = g.pairwiseSwap(head);
            
            Node temp = head;
            int f = 0;
            while (temp != null) 
    		{ 
    			if(mp.get(temp) != temp.data){
    			    f = 1;
    			}
    			temp = temp.next; 
    		} 
            
            if(f==1){
                printList(failure); 
            }
            else{
                printList(head); 
            }
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null)
        return head;
        Node prev=head;
       Node curr=head.next;
       
       head=curr;
        
        while(true)
        {   
        Node next=curr.next;
        curr.next=prev;
        if(next==null || next.next==null){
        prev.next=next;
        break;}
        prev.next=next.next;
        prev=next;
        curr=prev.next;
        
       
           
        }
        
          
          
          
            
        
        return head;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Add two numbers represented by linked lists 

// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        int c=0;
        Node a=reverse(first);
        Node b=reverse(second);
        Node s=null;
        Node head = null;
        while(a!=null && b!=null)
        {
            int sum=(c+a.data+b.data)%10;
             c=(c+a.data+b.data)/10;
            Node n=new Node(sum);
             if(s==null)
             {   s=n;
                head = n;
             }
            else{
            s.next=n;
            s=s.next;
            }
            a=a.next;
            b=b.next;
        }
         while(a!=null)
        {
            int sum=(c+a.data)%10;
             c=(c+a.data)/10;
            Node n=new Node(sum);
            if(s==null)
                s=n;
            else{
            s.next=n;
            s=s.next;}
            a=a.next;
        }
         while(b!=null)
        {
            int sum=(c+b.data)%10;
             c=(c+b.data)/10;
            Node n=new Node(sum);
             if(s==null)
                s=n;
            else{
            s.next=n;
            s=s.next;}
            b=b.next;
        }
        if(c>0){
        Node c1=new Node(c);
        s.next=c1;}
        Node h1 = reverse(head);
        return h1;
    }
    static Node reverse(Node node)
    {
        Node prev=null;
        Node curr=node;
        Node succ=null;
        while(curr!=null)
        {
            succ=curr.next;
            curr.next=prev;
            prev=curr;
            curr=succ;
        }
        node=prev;
       return node;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Sorted insert for circular linked list


//Code by:Saksham Raj Seth
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class LL{
Node head;
Node tail;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            LL llist = new LL();
			llist.head=null;
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
			int value=sc.nextInt();
			Node phead=head;
			while(phead.next!=null){
				phead=phead.next;
			}
			phead.next=head;
            Solution ob=new Solution();
			head = ob.sortedInsert(head,value);
			Node current = head;
			
			if(head != null){
			    do{
			        System.out.print(current.data+" ");
			        current = current.next;
			    }while(current != head);
			}
			System.out.println();
        }
    }
}// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class Solution
{
	public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            Node curr=head;
            if(curr.data>data)
            {
             while(curr.next!=head){
             curr=curr.next;
             }
             Node n=new Node(data);
             n.next=curr.next;
             curr.next=n;
             head=n;
             return head;
            }
            Node prev=null;
            while(true)
            {    
                if(curr.data>=data){
                Node n=new Node(data);
                
                n.next=prev.next;
                
                prev.next=n;
                    return head;
                }
                prev=curr;
                curr=curr.next;
            }
          
         }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Detect Loop in linked list

//Initial template code for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        HashMap<Node,Integer> m=new HashMap<Node,Integer>();
        Node curr=head;
        while(curr!=null)
        {
            if(m.containsKey(curr.next))
            return true;
            else
            m.put(curr.next,curr.data);
            curr=curr.next;
        }
        return false;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
